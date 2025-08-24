public class HelloWorld {
    String name; 
    private int age;
    public HelloWorld(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void greet() {
        System.out.println("Hello, " + name + "!");
    }

    public void greet(String customMessage) {
        System.out.println(customMessage + ", " + name + "!");
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        HelloWorld student = new HelloWorld("Sam", 31); 
        student.greet(); 
        student.greet("Welcome");
        student.introduce();
        } 
    }
    

