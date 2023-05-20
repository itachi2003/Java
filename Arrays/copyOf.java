import java.util.Arrays;
class Main {
    public static void main(String[] args) {
      int number[] = {1, 2, 3, 4, 5};
      int anotherNumber[] = Arrays.copyOf(number, 20);
      Arrays.fill(number, 1);   
            System.out.println(Arrays.toString(anotherNumber));
System.out.println(Arrays.toString(number));
  }
}

// [1,2,3,4,5,0,0]
// [1,1,1,1,1]