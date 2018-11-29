import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Week10 {

  // 2D integer array using a for loop
  int[][] board = new int[3][3];

  for( int i = 0;i<board.length;i++)
  {
    for (int j = 0; j < board[i].length; j++) {
      board[i][j] = i + j;
    }
  }
}


