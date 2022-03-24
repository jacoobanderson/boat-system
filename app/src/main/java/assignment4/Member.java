package assignment4;

import java.util.ArrayList;

/**
 * This class represents the member.
 */
public class Member {
  private String name;
  private String email;
  private String uniqueId;
  private ArrayList<Boat> boats = new ArrayList<Boat>();

  /**
   * Constructor.
   */
  public Member() {
  }

  /**
   * Constructor.
   *
   * @param name The name.
   * @param email The type of boat.
   * @param uniqueId The length of the boat.
   */
  public Member(String name, String email, String uniqueId) {
    setName(name);
    setEmail(email);
    setUniqueId(uniqueId);
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
   * Gets the name of the member.
   *
   * @return String representing the name.
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the email.
   *
   * @param email The email.
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Gets the email of the member.
   *
   * @return String representing the email.
   */
  public String getEmail() {
    return email;
  }

  /**
   * Sets the unique id.
   *
   * @param id The unique id.
   */
  public void setUniqueId(String id) {
    this.uniqueId = id;
  }

  /**
   * Gets the unique id of the member.
   *
   * @return String representing the unique id.
   */
  public String getUniqueId() {
    return uniqueId;
  }

  /**
   * Adds a boat to the member.
   */
  public void addBoat(Boat boat) {
    boats.add(boat);
  }

  /**
   * Gets all the boats of the member.
   *
   * @return array list with all the boats.
   */
  public ArrayList<Boat> getBoats() {
    ArrayList<Boat> boatsCopy = new ArrayList<Boat>(boats);
    return boatsCopy;
  }

  /**
   * Sets the boats.
   *
   * @param boats A list of boats.
   */
  public void setBoats(ArrayList<Boat> boats) {
    ArrayList<Boat> boatsCopy = new ArrayList<Boat>(boats);
    this.boats = boatsCopy;
  }

  /**
   * Adds a boat to the member.
   */
  public void showMemberInfo() {
    System.out.println("\nMember: " + name);
    System.out.println("Email: " + email);
    System.out.println("ID: " + uniqueId + "\n");

    for (int i = 0; i < boats.size(); i++) {
      System.out.println("Boat " + (i + 1) + ":");
      System.out.println("Name: " + boats.get(i).getName());
      System.out.println("Type: " + boats.get(i).getType() + "\n");
    }
  }
}
