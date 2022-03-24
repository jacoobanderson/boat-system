package assignment4;

/**
 * This class represents the motorboat.
 */
public class Motorboat extends Boat {
  private int enginePower;

  /*
   * Constructor.
   */
  public Motorboat() {
  }

  /**
   * Constructor.
   *
   * @param name The name.
   * @param type The type of boat.
   * @param length The length of the boat.
   * @param enginePower The engine power of the boat.
   */
  public Motorboat(String name, String type, int length, int enginePower) {
    super(name, type, length);
    setEnginePower(enginePower);
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
   * Shows boat information.
   */
  public void showBoatInfo() {
    System.out.println("Name: " + super.getName());
    System.out.println("Type: " + super.getType());
    System.out.println("Length: " + super.getLength() + "m");
    System.out.println("Engine Power: " + getEnginePower() + "hp");
  }

  /**
   * Gets the info of the boat.
   *
   * @return An array of information.
   */
  public String[] getBoatInfo() {
    String[] info = { super.getName(), super.getType(), 
      Integer.toString(super.getLength()), Integer.toString(getEnginePower()) };
    return info;
  }
}
