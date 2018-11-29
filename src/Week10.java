import java.util.Scanner;
import java.util.Arrays;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Week10 {
  public static void main(String[] args) throws InterruptedException {

    // Scanner scan = new Scanner(System.in);
    
    //Declare, instantiate, initialize and use a one-dimensional array
    int[] arr = new int[10];
    int x = 0;
    //Find the smallest value in an array.
    //Get a sum of the values in an array using an accumulator.
    for (int i = 0; i < arr.length ; i++) {
      int rand = (int) Math.round(Math.random() * 100);
      arr[i] = rand;
      x = x + arr[i];
    }
    Arrays.sort(arr);
    System.out.println("The Min value of the random array is " +arr[0]);
    System.out.println("The sum of the random array is " + x);

  }
}


