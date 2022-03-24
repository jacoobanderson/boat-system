package assignment4;

/**
 * This class represents the sailboat.
 */
public class Sailboat extends Boat {
  private int depth;

  /*
   * Constructor.
   */
  public Sailboat() {
  }

  /**
   * Constructor.
   *
   * @param name The name.
   * @param type The type of boat.
   * @param length The length of the boat.
   * @param depth The depth of the boat.
   */
  public Sailboat(String name, String type, int length, int depth) {
    super(name, type, length);
    setdepth(depth);
  }

  /**
   * Sets the depth.
   *
   * @param depth depth.
   */
  public void setdepth(int depth) {
    this.depth = depth;
  }

  /**
   * Gets the depth.
   *
   * @return Integer representing the depth.
   */
  public int getdepth() {
    return depth;
  }

  /**
   * Shows boat information.
   */
  public void showBoatInfo() {
    System.out.println("Name: " + super.getName());
    System.out.println("Type: " + super.getType());
    System.out.println("Length: " + super.getLength() + "m");
    System.out.println("Depth: " + getdepth() + "m");
  }

  /**
   * Gets the info of the boat.
   *
   * @return An array of information.
   */
  public String[] getBoatInfo() {
    String[] info = { super.getName(), super.getType(), 
      Integer.toString(super.getLength()), Integer.toString(getdepth()) };
    return info;
  }
}