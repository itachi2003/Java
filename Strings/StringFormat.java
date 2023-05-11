class Main {
    public static void main(String[] args) {
      String nickName = "BlockHero";
      String University = "GTU";
      int age = 20;
      String Company = "Freelancer";
      double gpa = 1.9;
      char percent = '%';
      boolean yes = true;
      char tire = '-';
  
      System.out.println(String.format(
        "My nickName is %s. I study university at %s. I am %d years old. I am %s. My GPA is %.1f. Truly motivated 100%c and My fav quote is %c %b warrior don't need a sword.", 
        nickName, University, age, Company, gpa, percent,tire, yes
      ));
    }
  }