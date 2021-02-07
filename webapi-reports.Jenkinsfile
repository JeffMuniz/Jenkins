#!/usr/bin/env groovy

versao = "1.0.${env.BUILD_ID}"
def dt_dev
def startbuild_dev
def isStartedByUser = true

pipeline {
    agent { node { label 'dotnet-22'} }
    environment 
    {		
		PRJ_PATH='.'
        PUBLISH_PATH='src/Reports.WebApi'
        PRJ_NAME='Tabela.Orizon.Reports.sln'
		TEST_PATH='tests/Reports.Tests/'
		OPENSHIFT_PROJECT_NAME='tabela-orizon'
		APPLICATION_NAME='orizon-tabela-reports' 
		SONAR_PATH='/home/jenkins/.dotnet/tools'	   
        SONAR_SERVER='http://sonarqube.orizon.local'
		SONAR_RESULT='/tmp/workspace/tabela-orizon/orizon-tabela-orizon'
		NEXUS_PKG_GROUP='gestao-insumos' 
		JKS_PRODUCT = "Gestao de Insumos"
        JKS_PROJECT = "Gestao de Insumos"
		VERSION = "${versao}"
        SONAR_PROJECT_URL='http://sonarqube.orizon.local/dashboard?id=orizon-tabela-reports'
        CHAT_WEBHOOK='https://chat.googleapis.com/v1/spaces/AAAAaXyoe6w/messages?key=AIzaSyDdI0hCZtE6vySjMm-WEfRq3CPzqKqqsHI&token=T3KGSnrUwDfxQjXd82ysNhz3pp1O_TADWdBk8-rWHgc%3D'
		API_NAME = 'reports'
        FORTIFY_PROJECT_NAME='tabela-orizon-webapi-reports'
    }
    options 
    {
      gitLabConnection('Gitlab')
    }
    triggers 
    {
        gitlab(
            triggerOnPush: false,
            triggerOnMergeRequest: false,
            triggerOnAcceptedMergeRequest: true,
            branchFilterType: 'All',
            secretToken: 'b10c0ffa2f0f2fe5b3fcc84f8342daa1')
    }
    stages 
    {
        stage('[CI] - validate-branch') 
        {
            steps 
            {
                script
                {
                    if ( currentBuild.rawBuild.getCauses()[0].toString().contains('UserIdCause') )
                    {
                        isStartedByUser = false
                    }

                    if(isStartedByUser)
                    {
                        echo '*************************************************************************'
                        echo "QUEM FEZ COMMIT? ${env.gitlabUserName}"
                        echo '*************************************************************************'                  

                        if (gitlabSourceBranch ==~ /^release\/+[0-9]+\.[0-9]+\.[0-9]/ ) 
                        {
                            def mensagem = "Branch inválida para build na esteira!"
                            echo mensagem
                            currentBuild.result = 'ABORTED'
                            error(mensagem)
                        }
                    } 
                    else
                    {
                        echo '*************************************************************************'
                        echo "QUEM FEZ COMMIT? BUILD MANUAL"
                        echo '*************************************************************************'         
                    }                             
                }			    
            }
        }
        stage('[CI] - clean') 
        {
            steps 
            {
			    sh 'dotnet clean ${PRJ_PATH}/${PRJ_NAME}'
            }
        }
        stage('[CI] - sonar-config') 
        {
           steps 
           {  
                sh 'dotnet tool install --global dotnet-sonarscanner --version 4.7.1'               
           }
        } 
        stage('[CI] - restore') 
        {
           steps 
           {  
               sh 'dotnet restore ${PRJ_PATH}/${PRJ_NAME}'		    
           }
        }
            
        stage('[CI] - sonar-start') 
        {
            steps
            {
                script 
                {
                    withSonarQubeEnv('sonarqube orizon')  
                    {			
                        
                        echo "QUEM FEZ COMMIT? ${env.gitlabUserName}"
                        echo "${APPLICATION_NAME}"                       
					    
					    sh "${SONAR_PATH}/dotnet-sonarscanner begin /key:${APPLICATION_NAME} /name:${APPLICATION_NAME} /version:1.${env.BUILD_ID} /d:sonar.host.url=${SONAR_SERVER} /d:sonar.verbose=true /d:sonar.cs.opencover.reportsPaths=${SONAR_RESULT}/opencover-results/result.xml /d:sonar.analysis.projeto=\"Gestao de Insumos\" /d:sonar.analysis.user=\"${env.gitlabUserName}\""                     
                        
                    }
                }
            }
        }  
        stage('[CI] - build') 
        {
           steps 
           {
               sh 'dotnet build --no-restore -c Release ${PRJ_PATH}/${PRJ_NAME}'		    
           }
        }	
        stage('[CI] - test-unit')
	    {
			steps
			{		
                sh "mkdir -p ${SONAR_RESULT}/opencover-results"
                sh "mkdir -p ${PRJ_PATH}/test-results"	
                sh 'dotnet test ${PRJ_PATH}/${TEST_PATH} --logger:"xunit;LogFilePath=../../test-results/test_result.xml" /p:CollectCoverage=true /p:CoverletOutputFormat=opencover /p:CoverletOutput=${SONAR_RESULT}/opencover-results/result.xml'
				
         	    xunit (
					testTimeMargin: '3000', 
					thresholdMode: 2, 
					thresholds: [
						failed(failureNewThreshold: '0', failureThreshold: '80', unstableNewThreshold: '0', unstableThreshold: '80'), 
						skipped(failureNewThreshold: '0', failureThreshold: '0', unstableNewThreshold: '0', unstableThreshold: '0')
					],
					tools: [
						xUnitDotNet(deleteOutputFiles: false, failIfNotNew: false, pattern: 'test-results/test_result.xml', skipNoTestFiles: true, stopProcessingIfError: true)
					]
				)
			}
	    }
        stage('[CI] - sonar-end') 
        {
            steps 
            {
                withSonarQubeEnv('sonarqube orizon')
                {
                    sh "${SONAR_PATH}/dotnet-sonarscanner end "
                }
            }
		}		  
         stage('[CI] - quality & security-gates')
        {
            parallel
            {        
                stage('[CI] - check-quality-gate') 
                {
                    steps 
                    {
                        echo 'Checking quality gate...'
                        script 
                        {
                            timeout(time: 1, unit: 'HOURS') 
                            {
                                sleep(80)
                                def qg = waitForQualityGate()
                                if (qg.status == 'ERROR') {
                                    error "Código fonte não está de acordo com as metas de qualidade definidas no Sonar: ${qg.status}"
                                }
                            }
                        }
                    }
                }
                stage('[CI] - check-security-gate')
                {
                    steps
                    {
                        script
                        {
                            def handle = triggerRemoteJob(
                                job: 'http://jenkins-ci.orizon.local/job/RunFortify',
                                parameters: "GitCommitID=${env.GIT_COMMIT}\nGitUrl=${env.GIT_URL}\nProjectName=${env.FORTIFY_PROJECT_NAME}\nSolutionName=${env.PRJ_NAME}\nBU=${env.JKS_PRODUCT}",
                                blockBuildUntilComplete: true,

                                auth: CredentialsAuth(credentials: 'svc_hpdevops')
                            )
                            echo 'Remote Status: ' + handle.getBuildStatus().toString()
                        }
                    }
                }
            }
        }  
        stage('[CI] - publish') 
        {
           steps 
           {
               sh 'dotnet publish --no-restore --no-build -c Release -o app ${PRJ_PATH}/${PRJ_NAME}'
			   sh 'ls'
			   sh 'ls ${PUBLISH_PATH}'
           }
        }            
        stage('[CD] - nexus-upload') 
        {			
            steps 
            {	
                sh "zip -r ${APPLICATION_NAME}.zip ${PRJ_PATH}/${PUBLISH_PATH}/app"

                nexusArtifactUploader (
                    nexusVersion: 'nexus3',
                    protocol: 'http',
                    nexusUrl: 'nexus.orizon.local',
                    repository: 'gestao-insumos',
                    credentialsId: 'adminnexus',
                    version: "${versao}",
                    groupId: "${NEXUS_PKG_GROUP}",
                    artifacts: [
                        [artifactId: "${APPLICATION_NAME}",
                        type: 'zip',
                        classifier: '',                        
                        file: "./${APPLICATION_NAME}.zip"]
                    ]
                )
            }
        }
        stage('[CD] - create-runtime-image') 
        {
            when {
                expression {
                    openshift.withCluster() {
                        openshift.withProject("${OPENSHIFT_PROJECT_NAME}-dev") {
                            echo "USING PROJECT: ${openshift.project()}"                            
                            return !openshift.selector("bc", "${APPLICATION_NAME}").exists();
                        }
                    }
                }
            }
            steps {
                script {
                    openshift.withCluster() {                        
                        openshift.withProject("${OPENSHIFT_PROJECT_NAME}-dev") {
                            echo "Creating new image"
                            openshift.newBuild("--name=${APPLICATION_NAME}", "--image-stream=cicd-tools/dotnet-22-runtime-openshift", "--binary=true")
                        }
                    }
                }
            }
        }
        stage('[CD] - build-runtime-image') {
            steps {
                script {
                    openshift.withCluster() {
                        openshift.withProject("${OPENSHIFT_PROJECT_NAME}-dev") {
                            openshift.selector("bc", "${APPLICATION_NAME}").startBuild("--from-dir=${PUBLISH_PATH}/app", "--wait=true")
                        }
                    }
                }
            }
        }
           stage('[CD] - deploy-dev') {
            steps {
                script {
                    openshift.withCluster() {
                        openshift.withProject("${OPENSHIFT_PROJECT_NAME}-dev") 
                        {
							echo 'APPLICATION_TAG : ${APPLICATION_NAME}:${versao}'
							openshift.tag("${APPLICATION_NAME}:latest", "${APPLICATION_NAME}:${versao}")
							
							echo 'APPLICATION_NAME : ${APPLICATION_NAME}'
                            if (!openshift.selector('dc', "${APPLICATION_NAME}").exists()) 
                            {   
                                echo 'Criando dev'
                                def app = openshift.newApp("${APPLICATION_NAME}:${versao}",  "--name=${APPLICATION_NAME}")
								app.narrow("svc").expose();
                            }
							
							echo 'OPENSHIFT_CONFIGMAP : ${OPENSHIFT_PROJECT_NAME}-configmap'
                            if (openshift.selector('configmap', "${OPENSHIFT_PROJECT_NAME}-configmap").exists()) 
                            {   
                                echo "Injecting DEV configmap: ${OPENSHIFT_PROJECT_NAME}-configmap"                                       
                                openshift.set("env", "dc/${APPLICATION_NAME}", "--from=configmap/${OPENSHIFT_PROJECT_NAME}-configmap")
                            } 
                            else 
                            {
                                echo "Configmap ${OPENSHIFT_PROJECT_NAME}-configmap not found."
                            }

							echo 'OPENSHIFT_CONFIGMAP : ${APPLICATION_NAME}-configmap'
                            if (openshift.selector('configmap', "${APPLICATION_NAME}-configmap").exists()) 
                            {   
                                echo "Injecting DEV configmap: ${APPLICATION_NAME}-configmap"                                       
                                openshift.set("env", "dc/${APPLICATION_NAME}", "--from=configmap/${APPLICATION_NAME}-configmap")
                            } 
                            else 
                            {
                                echo "Configmap ${APPLICATION_NAME}-configmap not found."
                            }
							                            
                            def dc = openshift.selector("dc", "${APPLICATION_NAME}")
                            while (dc.object().spec.replicas != dc.object().status.availableReplicas) 
                            {
                                sleep 10
                            }
                        }
                    }
                }
            }
        }		
		stage('[CD] - dev-apiman') {
            steps {
                script {
                    wrap([$class: 'AnsiColorBuildWrapper', colorMapName: "xterm"]) {
                        echo "Stage: ${STAGE_NAME}"
                        echo "${VERSION}"
                        ansibleTower(
                            async: false,
                            credential: '',
                            extraVars: """---
                            api_version_full: "1.2"
                            api_name: "${API_NAME}"
                            url_api_pre: "http://${APPLICATION_NAME}"
                            url_api_pos: "tabela-orizon-dev.cpdh.orizon.local/api/"
                            apiman_org: "tabela-orizon"
                            apiman_public: "false"
                            apiman_client: "client-servicos-tabelaorizon"
                            apiman_client_version: "1.0"
                            apiman_plan: "PlanAPIsAutenticadas"
                            apiman_plan_version: "1.4"
                            apiman_contract_clients_versions: "1.0"
                            """,
                            importTowerLogs: true,
                            importWorkflowChildLogs: false,
                            inventory: '',
                            jobTags: '',
                            jobTemplate: 'TPT-ANS-APIMAN-OCP-DEV',
                            jobType: 'run',
                            limit: '',
                            removeColor: false,
                            skipJobTags: '',
                            templateType: 'job',
                            throwExceptionWhenFail: false,
                            towerCredentialsId: 'AnsibleTower',
                            towerServer: 'Ansible_Tower',
                            verbose: true
                        ) 
                    }
                }
            }
        }
        stage('[CD] - dev-reports-kpi')
        {
            steps 
            {
                script 
                {
                    wrap([$class: 'BuildUser']) {
                        echo "Stage: ${STAGE_NAME}"
                        def result = "${currentBuild.currentResult}"
                        dt_dev = new Date(currentBuild.startTimeInMillis)
                        def jks_user = ""
                        echo "User atual: ${env.gitlabUserName}"
                        if (env.gitlabUserName == null) {
                            jks_user = "${BUILD_USER}"
                            echo "User Jenkins: ${jks_user}"
                            }else {
                            jks_user = "${env.gitlabUserName}"
                            echo "User Git: ${jks_user}"
                        }
                        startbuild_dev = dt_dev.format("yyyy-MM-dd HH:mm:ss", TimeZone.getTimeZone('America/Sao_Paulo'))
                        ansibleTower(
                          towerServer: 'Ansible_Tower',
                          templateType: 'job',
                          jobTemplate: 'TPT-ANS-REPORTS-KPIS-DEV',
                          importTowerLogs: true,
                          removeColor: false,
                          verbose: true,
                          extraVars: """---
                          jks_user: "${jks_user}"
                          jks_result: "${currentBuild.currentResult}"
                          jks_build_url: "${BUILD_URL}"
                          jks_job_name: "${JOB_BASE_NAME}"
                          jks_id_task: "${currentBuild.number}"
                          jks_project: "${JKS_PROJECT}"
                          jks_startbuild: "${startbuild_dev}"
                          jks_product: "${JKS_PRODUCT}"
                          """,
                          async: false
                        )
                    }
                }
            }
        }
       
    }	
	post 
    {
        failure 
        {
            updateGitlabCommitStatus name: 'build', state: 'failed'
        }
        success 
        {
            updateGitlabCommitStatus name: 'build', state: 'success'
        }
        aborted 
        { 
            updateGitlabCommitStatus name: 'build', state: 'canceled' 
        }
        always 
        { 
            googlechatnotification (
                url:"${CHAT_WEBHOOK}",
                message:    "API: ${API_NAME} \n" +
                            "Job: ${JOB_BASE_NAME} \n" +
                            "Author: ${env.gitlabUserName} \n" +                                                      
                            "Build: ${env.BUILD_ID} \n" +
                            "Duration: ${currentBuild.durationString} \n" +
                            "Result: ${currentBuild.currentResult} \n" +
                            "<${SONAR_PROJECT_URL}|SONAR REPORT>",
                notifyFailure: 'true',
                notifySuccess: 'true',
                notifyAborted: 'true',
                sameThreadNotification: 'true'
            )
        }
    }
}
