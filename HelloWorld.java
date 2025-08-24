// A simple Java program that demonstrates class creation, constructors, methods, and method overloading.

public class HelloWorld {
    String name; 
    private int age;

    // Constructor for setting name and age
    public HelloWorld(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to greet the user
    public void greet() {
        System.out.println("Hello, " + name + "!");
    }

    // Overloaded method to greet with a custom message
    public void greet(String customMessage) {
        System.out.println(customMessage + ", " + name + "!");
    }

    // Method to introduce the user
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    //orirginal main method for testing
    // public static void main(String[] args) {
    //     HelloWorld student = new HelloWorld("Sam", 31); 
    //     student.greet(); 
    //     student.greet("Welcome");
    //     student.introduce();
    //     } 
    }
    

