String script = """
class Book {
    private String name 
    void setName(String bookName) {
        name=bookName
        print "Book Name => "+bookName+"\\n";
    }

    String getName(){
        return name;
    }
}


class TestClass {
    static  main(args) {
        Book t = new Book();
        t.setName("First Book");
        print "book title=>"+t.getName()+"\\n"
    }
}
"""
GroovyClassLoader loader = new GroovyClassLoader()
GroovyCodeSource codeSource = new GroovyCodeSource(script, "MyClass", GroovyShell.DEFAULT_CODE_BASE)
println loader.parseClass(codeSource)
//
//https://stackoverflow.com/questions/38409400/error-caught-groovy-lang-groovyruntimeexception-this-script-or-class-could-not