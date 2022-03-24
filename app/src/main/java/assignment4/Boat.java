package assignment4;

/**
 * This is the class that represents a boat.
 */
public abstract class Boat {
  private String name;
  private String type;
  private int length;

  /**
   * Constructor.
   */
  public Boat() {
  }

  /**
   * Constructor.
   *
   * @param name The name.
   * @param type The type of boat.
   * @param length The length of the boat.
   */
  public Boat(String name, String type, int length) {
    setName(name);
    setType(type);
    setLength(length);
  }

  /**
   * Sets the name.
   *
   * @param name The name.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets the name of the boat.
   *
   * @return The name of boat as a string.
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the type.
   *
   * @param type The type.
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Gets the type of the boat.
   *
   * @return The type of boat as a string.
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the length of the boat.
   *
   * @param length The length.
   */
  public void setLength(int length) {
    this.length = length;
  }

  /**
   * Gets the length of the boat.
   *
   * @return The length of boat as an integer.
   */
  public int getLength() {
    return length;
  }

  /**
   * Abstract method.
   */
  public abstract void showBoatInfo();

  /**
   * Abstract method.
   */
  public abstract String[] getBoatInfo();
}
