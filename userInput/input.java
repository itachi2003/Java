import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        System.out.printf("Hello %s, you're welcome.\n", name);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.printf("%d is an excellent age to start programming.\n", age);
        System.out.print("Enter your favorite programming language: ");
        String language = scanner.nextLine();

        System.out.printf("%s is a very popular programming language.\n", language);
        scanner.close();
    }
}
