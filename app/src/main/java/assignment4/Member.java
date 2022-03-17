package assignment4;

import java.util.ArrayList;

public class Member {
  private String name;
  private String email;
  private String uniqueId;
  private ArrayList<Boat> boats = new ArrayList<Boat>();

  public Member() {
  }

  public Member(String name, String email, String uniqueId) {
    setName(name);
    setEmail(email);
    setUniqueId(uniqueId);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  public void setUniqueId(String id) {
    this.uniqueId = id;
  }

  public String getUniqueId() {
    return uniqueId;
  }

  public void addBoat(Boat boat) {
    boats.add(boat);
  }

  public ArrayList<Boat> getBoats() {
    ArrayList<Boat> boatsCopy = new ArrayList<Boat>(boats);
    return boatsCopy;
  }

  public void setBoats(ArrayList<Boat> boats) {
    this.boats = boats;
  }

  public void showMemberInfo() {
    System.out.println("\nMember: " + name);
    System.out.println("Email: " + email);
    System.out.println("ID: " + uniqueId + "\n");

    for (int i = 0; i < boats.size(); i++) {
      System.out.println("Boat " + (i + 1) + ":" );
      System.out.println("Name: " + boats.get(i).getName());
      System.out.println("Type: " + boats.get(i).getType() + "\n");
    }
  }
}
