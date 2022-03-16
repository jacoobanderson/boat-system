package assignment4;

public abstract class Boat {
  private String name;
  private String type;
  private int length;

  public Boat() {
  }

  public Boat(String name, String type, int length) {
    setName(name);
    setType(type);
    setLength(length);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public int getLength() {
    return length;
  }

  public abstract void showBoatInfo();

  public abstract String[] getBoatInfo();
}
