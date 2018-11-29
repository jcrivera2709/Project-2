import java.util.Scanner;
import java.util.Arrays;

public class Week10 {
  public static void main(String[] args) throws InterruptedException {

    Scanner scan = new Scanner(System.in);

    // Declare, instantiate, initialize and use a one-dimensional array
    int[] arr = new int[10];
    int x = 0;
    // Find the smallest value in an array.
    // Get a sum of the values in an array using an accumulator.
    for (int i = 0; i < arr.length; i++) {
      int rand = (int) Math.round(Math.random() * 100);
      arr[i] = rand;
      x = x + arr[i];
    }
    Arrays.sort(arr);
    System.out.println("The Min value of the random array is " + arr[0]);
    System.out.println("The sum of the random array is " + x);
    System.out.println();
    //Declare, instantiate, initialize and use multi-dimensional arrays
    int[][] multi = new int[][] {
      { 1 , 2 , 3 },
      { 4 , 5 , 6 },
      { 7 , 8 , 9 },
    };
    
    //Search a two-dimensional array and identify the coordinates where a value was found
    System.out.println("Pick a number between 1 - 3");
    int num1 = scan.nextInt();
    System.out.println("Pick another number from 1 - 3");
    int num2 = scan.nextInt();
    
    int ans = multi[num1-1][num2-1];
    
    System.out.println("The number in the corresponding array coordinates given by you is :"+ ans);
    
    scan.close();
  }
}


