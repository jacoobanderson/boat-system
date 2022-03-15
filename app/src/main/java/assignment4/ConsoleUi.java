package assignment4;

import java.util.Scanner;

public class ConsoleUi {
    private Scanner scan = new Scanner(System.in, "UTF-8");

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

    public String selectMember() {
        System.out.println("Enter the name of the member:");
        String name = readInput();
        return name;
    }

    public String readInput() {
        String input = scan.nextLine();
        return input;
    }

    public void exit() {
        scan.close();
    }
}
