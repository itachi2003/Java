import java.util.Arrays;
class Main {
    public static void main(String[] args) {
      char alphabet[] = {'a', 'b', 'c', 'd', 'e'};
      Arrays.sort(alphabet);
      int secondIndex = 1;
      int lastIndex = 4;
      char key = 'c';
      int foundItemIndex = Arrays.binarySearch(alphabet,secondIndex,lastIndex, key);
  System.out.println(Arrays.toString(alphabet));
  System.out.println(foundItemIndex);
  }
}