println 'Hello'                                 

int power(int n) { 2**n }                       

println "2^6==${power(6)}" 

node("myAgent") {
    timeout(unit: 'SECONDS', time: 5) {
        stage("One"){
            sleep 10
            echo 'hello'
        }
    }
}