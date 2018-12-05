import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Week10 {
  /**
   * This class runs all the code in this class. Throwing out interrupted exceptions.
   */
  public static void main(String[] args) throws InterruptedException {

    final Scanner scan = new Scanner(System.in);

    // Declare, instantiate, initialize and use a one-dimensional array
    int[] arr = new int[10];
    int x = 0;
    int z = 110;
    // Get a sum of the values in an array using an accumulator.
    for (int i = 0; i < arr.length; i++) {
      int rand = (int) Math.round(Math.random() * 100);
      arr[i] = rand;
      if (arr[i] < z) {
        z = arr[i];
      }
      x = x + arr[i];
    }
    // Find the smallest value in an array.
    System.out.println("The Min value of the random array is " + z);
    System.out.println("The sum of the random array is " + x);
    System.out.println();

    int[] numbers = new int[5];
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Please enter number");
      numbers[i] = scan.nextInt();
    }
    Arrays.sort(numbers);
    System.out.println("I have sorted the numbers from least to greatest.");
    System.out.println("Select one of the numbers that you entered.");
    int selected = scan.nextInt();

    for (int j = 0; j < numbers.length; j++) {
      if (numbers[j] == selected) {
        System.out.println("The number you selected is at index :" + j);
      }
    }
    // Declare, instantiate, initialize and use multi-dimensional arrays
    int[][] multi = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9},};
    // Search a two-dimensional array and identify the coordinates where a value was found
    System.out.println("Pick a number between 1 - 3");
    int num1 = scan.nextInt();
    System.out.println("Pick another number from 1 - 3");
    int num2 = scan.nextInt();
    int ans = multi[num1 - 1][num2 - 1];
    System.out.println("The number in the corresponding array coordinates given by you is :" + ans);
    System.out.println();

    // Declare and use an ArrayList of a given type
    ArrayList<String> list = new ArrayList<String>();
    list.add("Red");
    list.add("Green");
    list.add("Blue");
    System.out.println("Contents of the list: " + list);
    System.out.println();

    // Create and use the enhanced for loop
    int[] arr2 = new int[5];
    int y = 0;
    for (int i : arr2) {
      int rand = (int) Math.round(Math.random() * 100);
      arr[i] = rand;
      y = y + rand;
    }
    System.out.println("Here is the sum of a random generated enhanced for-loop " + y);
    scan.close();
  }
}


