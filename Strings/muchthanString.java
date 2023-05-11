class Main {
    public static void main(String[] args) {
      String nickName = "Block Hero";
      System.out.println(nickName.length()); // 10

      String pako = "pako";
      System.out.println(pako.isEmpty()); //false

      String anotherPako = "";
      System.out.println(anotherPako.isEmpty());  //true

      String bigWords = "Big Words";
      System.out.println(bigWords.toUpperCase());  // BIG WORDS
      System.out.println(bigWords.toLowerCase());  //big words
      /////////////////////////////////////////////////////////////////////////////////////////
      String one = "abc";
      String two = "abc";
      System.out.println(one == two);  //true

      String three = new String("def");
      String four = new String ("def");
      System.out.println(three == four); //false 

      String ains = new String("dgai");
      String cvai = new String ("dgai");
      System.out.println(ains.equals(cvai));  //true

      String bigname = new String("LAZO");
      String smallname = new String("lazo");
      System.out.println(bigname.equalsIgnoreCase(smallname));  //true

      String ptwop = "peer to peer";
      System.out.println(ptwop.replace("to", "tooo")); // peer tooo peer
    }
  }