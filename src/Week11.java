import java.util.Scanner;

public class Week11 {
  public static void main(String[] args) throws InterruptedException {
    Scanner scan = new Scanner(System.in);
    try {
      System.out.println("Enter a number");
      int num1 = scan.nextInt();
      System.out.println("Enter zero as a number");
      int num2 = scan.nextInt();
      System.out.println("Answer : " + num1 / num2);
    } catch (ArithmeticException ex) {
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

    try {
      String a = null;
      System.out.println(a.charAt(0));
    } catch (NullPointerException ex) {
      System.out.println("NullPointerException.");
    }
    try {
      String b = "This is like chipping ";
      char c = b.charAt(24);
      System.out.println(c);
    } catch (StringIndexOutOfBoundsException ex) {
      System.out.println("StringIndexOutOfBoundsException");
    }
//    try {
//      File file = new File("E://file.txt");
//
//      FileReader fr = new FileReader(file);
//    } catch (FileNotFoundException ex) {
//      System.out.println("File does not exist");
//    }
    try {
      int num3 = Integer.parseInt("akki");
      System.out.println(num3);
    } catch (NumberFormatException ex) {
      System.out.println("Number format exception");
    }
    try {
      int d[] = new int[5];
      d[6] = 9;
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("Array Index is Out Of Bounds");
    }
  }
}
