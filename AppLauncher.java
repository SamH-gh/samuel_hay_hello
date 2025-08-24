import java.util.Scanner;

public class AppLauncher {


        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = scnr.nextLine();
            System.out.print("Enter your age: ");
            int age = scnr.nextInt();
            scnr.nextLine(); // Consume the newline character
            HelloWorld user = new HelloWorld(name, age);
            user.greet();
            user.greet("Please introduce yourself");
            user.introduce();
            scnr.close();
        } 
}
