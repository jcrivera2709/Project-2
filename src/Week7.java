import java.util.Scanner;

public class Week7 {
  public static void main(String[] args) throws InterruptedException {
    Scanner scan = new Scanner(System.in);

    System.out.println("Type in the number of words you would like to split : ");
    int testCases = scan.nextInt();
    System.out.println("Type in the first WORD: ");
    String str = scan.nextLine();

    for (int i = 0; i < testCases ; i ++) {
      str = scan.nextLine();

      char[] charArray = str.toCharArray();

      for (int j = 0; j < str.length(); j++) {
        if (j % 2 == 0) {
          System.out.print(charArray[j]);
        }
      }
      System.out.print(" ");

      // for loop
      for (int j = 1; j < str.length(); j++) {
        // even though it says a problem it's not it works correctly
        if (j % 2 == 1) {
          System.out.print(charArray[j]);
        }
      }
      System.out.println();
      
    }
  }
}
