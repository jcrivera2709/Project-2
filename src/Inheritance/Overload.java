package Inheritance;

public class Overload {
  private int score;

  //Overload a method
  //Use super and this to access objects and constructors
  public Overload(int score) {
    System.out.println("Player one ready!");
    this.score = score;
  }
  
  public Overload() {
    System.out.println("Player two ready!");
    score = 0;
  }
  
  public void setScore(int sc) {
    score = sc;
  }

  public int getScore() {
    return score;
  }
}
