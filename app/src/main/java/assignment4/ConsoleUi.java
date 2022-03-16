package assignment4;

import java.util.Scanner;

public class ConsoleUi {
  private Scanner scan = new Scanner(System.in, "UTF-8");

  public String selectBoatView() {
    System.out.println("Enter the name of the boat:");
    String name = readInput();
    return name;
  }

  public String deleteBoatView() {
    System.out.println("1. Delete this boat");
    System.out.println("2. Return to the main menu");
    String action = readInput();
    return action;
  }

  public String startUi() {
    System.out.println("Choose what you want to do:");
    System.out.println("1. Create a new member");
    System.out.println("2. List all members");
    System.out.println("3. Select a member");
    System.out.println("4. Exit");

    String answer = readInput();
    return answer;
  }

  public String[] createMemberView() {
    System.out.println("Enter your name:");
    String name = readInput();

    System.out.println("Enter your email (optional):");
    String email = readInput();

    String[] member = {name, email};
    return member;
  }

  public String addBoatView() {
    System.out.println("Choose what type of boat:");
    System.out.println("1. Canoe");
    System.out.println("2. Motorboat");
    System.out.println("3. Motorsailer");
    System.out.println("4. Sailboat");
    String boat = readInput();
    return boat;
  }

  public String[] canoeView() {
    System.out.println("Enter the name of the boat:");
    String name = readInput();

    System.out.println("Enter the type of the boat:");
    String type = readInput();

    System.out.println("Enter the length of the boat:");
    String length = readInput();

    String[] boat = {name, type, length};
    return boat;
  }

  public String[] motorboatView() {
    System.out.println("Enter the name of the boat:");
    String name = readInput();

    System.out.println("Enter the type of the boat:");
    String type = readInput();

    System.out.println("Enter the length of the boat:");
    String length = readInput();

    System.out.println("Enter the engine power of the boat:");
    String power = readInput();

    String[] boat = {name, type, length, power};
    return boat;
  }

  public String[] motorsailerView() {
    System.out.println("Enter the name of the boat:");
    String name = readInput();

    System.out.println("Enter the type of the boat:");
    String type = readInput();

    System.out.println("Enter the length of the boat:");
    String length = readInput();

    System.out.println("Enter the engine power of the boat:");
    String power = readInput();

    System.out.println("Enter the depth of the boat:");
    String depth = readInput();

    String[] boat = {name, type, length, power, depth};
    return boat;
  }

  public String[] sailboatView() {
    System.out.println("Enter the name of the boat:");
    String name = readInput();

    System.out.println("Enter the type of the boat:");
    String type = readInput();

    System.out.println("Enter the length of the boat:");
    String length = readInput();

    System.out.println("Enter the depth of the boat:");
    String depth = readInput();

    String[] boat = {name, type, length, depth};
    return boat;
  }

  public String selectMember() {
    System.out.println("Enter the id of the member:");
    String id = readInput();
    return id;
  }

  public String selectedMemberView() {
    System.out.println("1. Delete this member");
    System.out.println("2. Add a boat");
    System.out.println("3. Select a boat");
    System.out.println("4. Return to the main menu");
    String id = readInput();
    return id;
  }

  public String readInput() {
    String input = scan.nextLine();
    return input;
  }

  public void exit() {
    scan.close();
  }

  public String goToMainMenu() {
    System.out.println("Press any key to go back to the main menu");
    String input = readInput();
    return input;
  }
}
