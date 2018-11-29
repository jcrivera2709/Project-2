//Inheritance allows the coder to derive information from the base class.
public class Inheritance {
  public static void main(String[] args) throws java.lang.Exception {
    Hero char1 = new Hero();
    Villian char2 = new Villian();
    Characters[] myChars = {char1, char2};
    for (Characters npc : myChars) {
      npc.showName();
      npc.Health();
    }
  }
}
