import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Week10 {
  public static void main(String[] args) throws InterruptedException {

    //Scanner scan = new Scanner(System.in);
    int arr [] = {};
    int i;
    for (i=0; i<10; i++) {
      int rand = (int) Math.round(Math.random() * 100);
      arr[i] = rand;
    }
    
    System.out.println(arr);
    
  }
}


