package inheritance;

//Inheritance allows the coder to derive information from the base class.
public class Hero extends Characters {
  public void showName() {
    System.out.println("John");
  }

  public void health() {
    System.out.println(1000);
  }
}