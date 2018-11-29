import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Week10 {
  public static void main(String[] args) throws InterruptedException {

    // Scanner scan = new Scanner(System.in);
    int[] arr = new int[10];
    for (int i = 0; i < 10; i++) {
      int rand = (int) Math.round(Math.random() * 10);
      arr[i] = rand;
    }
    
   
    for(int j=0;j <= arr.length; j++) {
      int x;
      x = Math.min(arr[j],arr[j+1]); 
      System.out.println(x);
    }
    

  }
}


