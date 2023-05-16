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

      if(operation.equals("sum")) {
        System.out.printf("%f + %f = %.1f", number1, number2, number1 + number2);
      } else if(operation.equals("sub")) {
        System.out.printf("%f - %f = %.1f", number1, number2, number1 - number2);
      } else if(operation.equals("mul")) {
        System.out.printf("%f * %f = %.1f", number1, number2, number1 * number2);
      }  else if(operation.equals("div")) {
        System.out.printf("%f / %f = %.1f", number1, number2, number1 / number2);
      } else {
        System.out.printf("don't do that ! ");
        String answer = scanner.nextLine();
        if(answer.equals("ok")){
          System.out.println("good boy");
        } else{
          System.out.println("sorry but you are not clever");
        }
      }
      scanner.close();
    }
  }