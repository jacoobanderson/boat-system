package assignment4;

import java.util.ArrayList;
import java.util.Random;

/**
 * This class represents the handling of the data.
 */
public class Data {
  private ArrayList<Member> members = new ArrayList<Member>();
  private Random rnd = new Random();

  /**
   * Creates a member from input.
   *
   * @param name name of the member.
   * @param email email of the member.
   */
  public void addMember(String name, String email) {
    String id = generateId();

    for (int i = 0; i < members.size(); i++) {
      if (members.get(i).getEmail().equals(email)) {
        email = "none";
      } else if (members.get(i).getUniqueId().equals(id)) {
        id = generateId();
      }
    }
    Member member = new Member(name, email, id);
    members.add(member);
  }

  /**
   * Generates a unique id for a member.
   */
  public String generateId() {
    String numberString = "1234567890";
    String characterString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    StringBuilder string = new StringBuilder();

    while (string.length() < 6) { 
      int index = (int) (rnd.nextFloat() * characterString.length());
      int numberIndex = (int) (rnd.nextFloat() * numberString.length());
      string.append(characterString.charAt(index));
      string.append(numberString.charAt(numberIndex));
    }

    String randomString = string.toString();
    return randomString;
  }

  /**
   * Lists all the members.
   */
  public void listMembers() {
    for (int i = 0; i < members.size(); i++) {
      System.out.println("Name: " + members.get(i).getName());
      System.out.println("ID: " + members.get(i).getUniqueId() + "\n");
    }
  }

  /**
   * Selects and shows a member by id.
   *
   * @param id Id of the member.
   */
  public void selectMember(String id) {
    for (Member member : members) {
      if (member.getUniqueId().equals(id)) {
        member.showMemberInfo();
      }
    }
  }

  /**
   * Selects a boat from input.
   *
   * @param name name of the boat.
   * @param id id of the member.
   */
  public void selectBoat(String name, String id) {
    Member member = getMemberById(id);
    ArrayList<Boat> boats = member.getBoats();
    for (int i = 0; i < boats.size(); i++) {
      if (boats.get(i).getName().equals(name)) {
        boats.get(i).showBoatInfo();
      }
    }
  }

  /**
   * Deletes a boat.
   *
   * @param name name of the boat.
   * @param id Id of the member.
   */
  public void deleteBoat(String name, String id) {
    Member member = getMemberById(id);
    ArrayList<Boat> boats = member.getBoats();
    for (int i = 0; i < boats.size(); i++) {
      if (boats.get(i).getName().equals(name)) {
        boats.remove(i);
      }
    }
    member.setBoats(boats);
  }

  /**
   * Deletes a member by input.
   *
   * @param id Id of the member.
   */
  public void deleteMember(String id) {
    for (int i = 0; i < members.size(); i++) {
      if (members.get(i).getUniqueId().equals(id)) {
        members.remove(i);
      }
    }
  }

  /**
   * Gets a member by input.
   *
   * @param id Id of the member.
   */
  public Member getMemberById(String id) {
    Member idMember = null;
    for (Member member : members) {
      if (member.getUniqueId().equals(id)) {
        idMember = member;
      }
    }
    return idMember;
  }

  /**
   * Constructor.
   *
   * @param name The name.
   * @param type The type of boat.
   * @param length The length of the boat.
   * @param member The member of the boat.
   */
  public void addCanoe(String name, String type, int length, Member member) {
    Canoe canoe = new Canoe(name, type, length);
    member.addBoat(canoe);
  }
 
  /**
   * Constructor.
   *
   * @param name The name.
   * @param type The type of boat.
   * @param length The length of the boat.
   * @param enginePower The engine power of the boat.
   * @param member The member of the boat.
   */
  public void addMotorboat(String name, String type, int length, int enginePower, Member member) {
    Motorboat motorboat = new Motorboat(name, type, length, enginePower);
    member.addBoat(motorboat);
  }

  /**
   * Adds a motorsailer.
   *
   * @param name The name.
   * @param type The type of boat.
   * @param length The length of the boat.
   * @param enginePower The engine power of the boat.
   * @param depth The depth of the boat.
   * @param member The member of the boat.
   */
  public void addMotorsailer(String name, String type, int length, int enginePower, int depth, Member member) {
    Motorsailer motorsailer = new Motorsailer(name, type, length, enginePower, depth);
    member.addBoat(motorsailer);
  }

  /**
   * Adds a sailboat.
   *
   * @param name The name.
   * @param type The type of boat.
   * @param length The length of the boat.
   * @param depth The depth of the boat.
   * @param member The member of the boat.
   */
  public void addSailboat(String name, String type, int length, int depth, Member member) {
    Sailboat sailboat = new Sailboat(name, type, length, depth);
    member.addBoat(sailboat);
  }

  /**
   * Saves to a file.
   */
  public void save() {
    FileHandler saveFile = new FileHandler();
    saveFile.saveData(members);
  }

  /**
   * Loads from a file.
   */
  public void load() {
    FileHandler loadFile = new FileHandler();
    loadFile.loadData(members);
  }
}
