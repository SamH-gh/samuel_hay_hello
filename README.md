# samuel_hay_hello
CSC 325 Project 1 Hello World

# level 1
installed VS code and Java as well as extensions. 
Created project and added code from instructions. 
Created GitHub repository and pushed code to it.

AI: I used GPT to aid me in getting the JDK path set up as it didn't automatically do so when downloading. Used Co-Pilot to aid with connecting GitHub to VScode then staging and commiting changes.

# level 2 
Added new code to display age as well as name and an overloaded greet() to allow a custom message. 

AI: I used Co-Pilot to explain how I would overload greet() to get me started. 

-- AI PROMPT: 
"how would I overload greet() to allow a custom message"

-- AI OUTPUT: 
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

    // Overloaded greet method
    public void greet(String customMessage) {
        System.out.println(customMessage + ", " + name + "!");
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        HelloWorld student = new HelloWorld("Sam", 20); 
        student.greet(); 
        student.greet("Welcome"); // Using the overloaded greet method
    }
}



# level 3
Created a new file called AppLauncher and moved main(). 
Imported scanner to take user input and output results in new HelloWorld objects.
Added exception handling to verify names and ages aren't impossible answers.
Put code in simple while loop to continuously ask student if a new student should be introduced at the end of each loop. 
Added JavaDoc to explain code.

AI: I used Co-pilot to help me with some issues I was having with commiting that involved conflicts between the main branch and my local branch. I also had it aid me with changing the name of my branch from "Master" to "Main". I then used Co-Pilot help me with setting up exception handling and setting the code into a while loop to continue getting input and creating HelloWorld objects. I used GPT to help me with getting my repository to only display "AppLauncher.java", "HelloWorld.java" and "README.md" which turned out to be embarrassingly simple but it took me a while to figure out.

Throughout the project, I utilized the AI suggested autocomplete for both the code an the JavaDoc. 
