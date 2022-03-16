package assignment4;

public class Sailboat extends Boat {
  private int depth;

  public Sailboat() {
  }

  public Sailboat(String name, String type, int length, int depth) {
    super(name, type, length);
    setdepth(depth);
  }

  public void setdepth(int depth) {
    this.depth = depth;
  }

  public int getdepth() {
    return depth;
  }

  public void showBoatInfo() {
    System.out.println("Name: " + super.getName());
    System.out.println("Type: " + super.getType());
    System.out.println("Length: " + super.getLength() + "m");
    System.out.println("Depth: " + getdepth() + "m");
  }

  public String[] getBoatInfo() {
    String[] info = { super.getName(), super.getType(), Integer.toString(super.getLength()), Integer.toString(getdepth()) };
    return info;
  }
}