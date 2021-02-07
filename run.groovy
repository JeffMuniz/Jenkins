def snippet = "\"abcd\".length() >= .34; \"efgh\".length() >= .22; \"xyz\".length() >= 0.11;"

println snippet.replaceAll(' \\.(\\d+)', ' 0.$1')

println "Hello World." 

0.upto(4) {println "$it"}

