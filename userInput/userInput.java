// statement imports the Scanner class from the java.util package. 
// The Scanner class allows us to read user input from the console.
import java.util.Scanner;

// declares a class named "Main". In Java, the entry point for a program is always a main method within a class.
class Main {
    public static void main(String[] args) {

        // we create a new Scanner object named scanner that reads input from System.in, which represents the standard input stream
      Scanner scanner = new Scanner(System.in);
      
    //   displays the message "what's your name?" to the console, prompting the user to enter their name
      System.out.println("what's your name?");
      String name = scanner.nextLine();
      
      System.out.println(name);
      
      System.out.printf("hello %s, you're welcome", name);
    //   statement closes the Scanner object to release any system resources associated with it.
      scanner.close();
    }
  }