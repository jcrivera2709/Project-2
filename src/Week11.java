import java.util.Scanner;

public class Week11 {
  public static void main(String[] args) throws InterruptedException {
    Scanner scan = new Scanner(System.in);
    try {
      System.out.println("Enter a number");
      int num1 = scan.nextInt();
      System.out.println("Enter another number");
      int num2 = scan.nextInt();
      System.out.println("Answer : " + num1 / num2);
    } catch (Exception ex) {
      System.out.println(ex);
    }  
    
    System.out.println();
    boolean correct = false;
    int num = 0;
    System.out.println("Enter a number");
    while (correct == false) {
      try {
        num = scan.nextInt();
        correct = true;
      } catch (Exception ex) {
        System.out.println("Please enter an integer");
        scan.nextLine();
      }
    }
    System.out.println("Thank you!");
  }
}
