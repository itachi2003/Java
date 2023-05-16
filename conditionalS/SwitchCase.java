import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

      System.out.print("write first number :");
      double number1 = scanner.nextDouble();
      scanner.nextLine();

      System.out.print("write second number : ");
      double number2 = scanner.nextDouble();
      scanner.nextLine();

      System.out.print("what operation do you prefer?");
      String operation = scanner.nextLine();

    switch (operation) {
      case "sum":
        System.out.printf("%f + %f = %.1f", number1, number2, number1 + number2);
        break;
      case "sub":
        System.out.printf("%f - %f = %.1f", number1, number2, number1 - number2);
        break;
      case "mul":
        System.out.printf("%f * %f = %.1f", number1, number2, number1 * number2);
        break;
      case "div":
        System.out.printf("%f / %f = %.1f", number1, number2, number1 / number2);
        break;
      default:
        System.out.println("try only sum-sub-mul-div");
    }
     
      scanner.close();
    }
  }