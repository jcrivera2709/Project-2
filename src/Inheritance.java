//Inheritance allows the coder to derive information from the base class and use this information across multiple classes with correct coding.
public class Inheritance {
  public static void main(String[] args) throws java.lang.Exception {
    Hero char1 = new Hero();
    Characters char2 = new Villian();
    //Develop code that makes use of polymorphism
    Characters[] myChars = {char1, char2};  
    for (Characters npc : myChars) {
      npc.showName();
      npc.Health();
      System.out.println();
    }   
  }
}
