package assignment4;

import java.util.Scanner;

/**
 * This is the starting point of the application.
 */
public class ConsoleUi {
  private Scanner scan = new Scanner(System.in, "UTF-8");

  /**
   * Displays the view for selecting a boat.
   */
  public String selectBoatView() {
    System.out.println("Enter the name of the boat:");
    String name = readInput();
    return name;
  }

  /**
   * Displays the view for deleting a boat.
   */
  public String deleteBoatView() {
    System.out.println("1. Delete this boat");
    System.out.println("2. Return to the main menu");
    String action = readInput();
    return action;
  }

  /**
   * Displays the view for the starting point.
   */
  public String startUi() {
    System.out.println("Choose what you want to do:");
    System.out.println("1. Create a new member");
    System.out.println("2. List all members");
    System.out.println("3. Select a member");
    System.out.println("4. Exit");

    String answer = readInput();
    return answer;
  }

  /**
   * Displays the view for creating a member.
   */
  public String[] createMemberView() {
    System.out.println("Enter name:");
    String name = readInput();

    System.out.println("Enter email (optional):");
    String email = readInput();

    String[] member = {name, email};
    return member;
  }

  /**
   * Displays the view for adding a boat.
   */
  public String addBoatView() {
    System.out.println("Choose what type of boat:");
    System.out.println("1. Canoe");
    System.out.println("2. Motorboat");
    System.out.println("3. Motorsailer");
    System.out.println("4. Sailboat");
    String boat = readInput();
    return boat;
  }

  /**
   * Displays the view for adding a canoe.
   */
  public String[] canoeView() {
    System.out.println("Enter the name of the boat:");
    String name = readInput();

    System.out.println("Enter the length of the boat:");
    String length = readInput();

    String[] boat = {name, length};
    return boat;
  }

  /**
   * Displays the view for adding a motorboat.
   */
  public String[] motorboatView() {
    System.out.println("Enter the name of the boat:");
    String name = readInput();

    System.out.println("Enter the length of the boat:");
    String length = readInput();

    System.out.println("Enter the engine power of the boat:");
    String power = readInput();

    String[] boat = {name, length, power};
    return boat;
  }

  /**
   * Displays the view for adding a motorsailer.
   */
  public String[] motorsailerView() {
    System.out.println("Enter the name of the boat:");
    String name = readInput();

    System.out.println("Enter the length of the boat:");
    String length = readInput();

    System.out.println("Enter the engine power of the boat:");
    String power = readInput();

    System.out.println("Enter the depth of the boat:");
    String depth = readInput();

    String[] boat = {name, length, power, depth};
    return boat;
  }

  /**
   * Displays the view for adding a sailboat.
   */
  public String[] sailboatView() {
    System.out.println("Enter the name of the boat:");
    String name = readInput();

    System.out.println("Enter the length of the boat:");
    String length = readInput();

    System.out.println("Enter the depth of the boat:");
    String depth = readInput();

    String[] boat = {name, length, depth};
    return boat;
  }

  /**
   * Gets the input of the id.
   *
   * @return The id.
   */
  public String selectMember() {
    System.out.println("Enter the id of the member:");
    String id = readInput();
    return id;
  }

  /**
   * Gets the input of the selected member menu.
   *
   * @return The input.
   */
  public String selectedMemberView() {
    System.out.println("1. Delete this member");
    System.out.println("2. Add a boat");
    System.out.println("3. Select a boat");
    System.out.println("4. Return to the main menu");
    String id = readInput();
    return id;
  }

  /**
   * Gets the input.
   *
   * @return The input.
   */
  public String readInput() {
    String input = scan.nextLine();
    return input;
  }

  /**
   * Closes the scan.
   */
  public void exit() {
    scan.close();
  }

  /**
   * Gets the input of the go to menu view.
   *
   * @return The input.
   */
  public String goToMainMenu() {
    System.out.println("Press any key to go back to the main menu");
    String input = readInput();
    return input;
  }
}
