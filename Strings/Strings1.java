class Main {
    public static void main(String[] args) {
      String name = "lazare";
      String nickname = "lazare";
  
      String lastName = new String("Lioner");
      String lastName2 = new String("Lioner");
  
      //true
      System.out.println(name == nickname);
      //false
      System.out.println(lastName == lastName2);
    }
  }