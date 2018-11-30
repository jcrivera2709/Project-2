import java.util.Scanner;

public class Week11 {
  public static void w11(String[] args) throws InterruptedException {
    Scanner scan = new Scanner(System.in);
    try {
      System.out.println("Enter a number");
      int num1 = scan.nextInt();
      System.out.println("Enter another number");
      int num2 = scan.nextInt();
      System.out.println("Result = " + num1 / num2);
    } catch (Exception ex) {
      System.out.println(ex);
    }
    scan.close();
  }
  
}
