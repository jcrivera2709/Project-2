// constructors and 
public class Constructors {
  private String name;
  private int health;

  public Constructors() {
    name = "John 117";
    health = 150;
  }

  public Constructors(String name, int health) {
    this.name = name;
    this.health = health;
  }

  public void setName(String person) {
    name = person;
  }

  public void setHealth(int HP) {
    health = HP;
  }

  public String getName() {
    return name;
  }

  public int getHealth() {
    return health;
  }
}
