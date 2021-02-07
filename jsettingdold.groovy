{
    "window.zoomLevel": 0,
    "files.defaultLanguage": "groovy",
    "explorer.confirmDelete": false,
    "jenkins-runner.hostConfigs": {

        "Orizoncicd": {
            //"url": "https://openshift-corp.orizon.local:8443/login/Orizon_AD?then=%2Foauth%2Fauthorize%3Fclient_id%3Dsystem%253Aserviceaccount%253Acicd-tools%253Ajenkins%26idp%3DOrizon_AD%26redirect_uri%3Dhttps%253A%252F%252Fjenkins-cicd-tools.cpdh.orizon.local%252FsecurityRealm%252FfinishLogin%26response_type%3Dcode%26scope%3Duser%253Ainfo%2Buser%253Acheck-access%26state%3DZjMzZDk5MDUtOTU2ZS00",
            //"url": "https://jenkins-cicd-tools.cpdh.orizon.local/",
            "url": "https://jenkins-cicd-tools.cpdh.orizon.local/job/PipelineModel/",
            "user": "jmoura.ext",
            "password": "orz@2020",
            "useCrumbIssuer": false,
            "rejectUnauthorizedCert": false
        },
        "teste": {
            "url": "https://jenkins-cicd-tools.cpdh.orizon.local/job/PipelineModel/",
            "user": "jmoura.ext",
            "password": "orz@2020",
            "useCrumbIssuer": false,
            "rejectUnauthorizedCert": false
        },
        "host-no-password": {
            "url": "http://server-no-auth:8090"
        }
    },
    "jenkins-runner.jobs": {
        "PipelineModel - defaults": {
            "isDefault": true,
            //"runWith": ["Orizoncicd", "master"],
            "runWith": ["teste", "master"],
            "name": "PipelineModel",
        },
       // "PipelineModel - other params": {
            //"runWith": "Orizoncicd",
         //   "runWith": "teste",
         //   "name": "PipelineModel",
         //   "parameters": {
         //       "message": "Hello World!"
         //   },
            "environment": {
        //      "HOST_NAME": "Orizoncicd",
                "HOST_NAME": "teste",
                "NAME": "PipelineModel",
                "CPU_COUNT": 3
            }
        }