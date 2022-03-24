package assignment4;

/**
 * This class represents a canoe.
 */
public class Canoe extends Boat {

  /*
   * Constructor.
   */
  public Canoe() {
  }

  /**
   * Constructor.
   *
   * @param name The name.
   * @param type The type of boat.
   * @param length The length of the boat.
   */
  public Canoe(String name, String type, int length) {
    super(name, type, length);
  }

  /**
   * Shows boat information.
   */
  public void showBoatInfo() {
    System.out.println("Name: " + super.getName());
    System.out.println("Type: " + super.getType());
    System.out.println("Length: " + super.getLength() + "m");
  }

  /**
   * Gets the info of the boat.
   *
   * @return An array of information.
   */
  public String[] getBoatInfo() {
    String[] info = { super.getName(), super.getType(), 
      Integer.toString(super.getLength()) };
    return info;
  }
}