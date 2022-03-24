package assignment4;

/**
 * This class represents the motorsailer.
 */
public class Motorsailer extends Boat {
  private int enginePower;
  private int depth;

  /**
   * Constructor.
   */
  public Motorsailer() {
  }

  /**
   * Constructor.
   *
   * @param name The name.
   * @param type The type of boat.
   * @param length The length of the boat.
   * @param enginePower The engine power of the boat.
   * @param depth The depth of the boat.
   */
  public Motorsailer(String name, String type, int length, int enginePower, int depth) {
    super(name, type, length);
    setEnginePower(enginePower);
    setdepth(depth);
  }

  /**
   * Sets the engine power.
   *
   * @param enginePower Amount of engine power.
   */
  public void setEnginePower(int enginePower) {
    this.enginePower = enginePower;
  }

  /**
   * Gets the engine power.
   *
   * @return Integer representing the engine power.
   */
  public int getEnginePower() {
    return enginePower;
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
    System.out.println("Engine Power: " + getEnginePower() + "hp");
    System.out.println("Depth: " + getdepth() + "m");
  }

  /**
   * Gets the info of the boat.
   *
   * @return An array of information.
   */
  public String[] getBoatInfo() {
    String[] info = { super.getName(), super.getType(), 
      Integer.toString(super.getLength()), Integer.toString(getEnginePower()), Integer.toString(getdepth()) };
    return info;
  }
}