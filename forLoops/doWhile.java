class Main {
    public static void main(String[] args) {
      int five = 5;
      int one = 1;
      do {
        System.out.printf("%d X %d = %d \n", five, one, one * five);
        one++;
      }
      while (one <= 10);
    }
  }