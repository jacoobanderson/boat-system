/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package assignment4;

/**
 * This is the generated Hello World Greeting App.
 */
public class App {
  /**
   * The App starting point.
   *
   * @param args Unused program arguments.
   */
  public static void main(String[] args) {
    App app = new App();
    app.start();
    // Member member = new Member("Jacob", "j00cwa@gmail.com", "123456");

    // Motorboat boatOne = new Motorboat("test", "Motorboat", 20, 200);
    // Motorsailer boatTwo = new Motorsailer("testTwo", "Motorsailer", 30, 250, 2);
    // Canoe boatThree = new Canoe("testThree", "Canoe", 40);
    // Sailboat boatFour = new Sailboat("testThree", "Sailboat", 40, 1);

    // member.addBoat(boatOne);
    // member.addBoat(boatTwo);
    // member.addBoat(boatThree);
    // member.addBoat(boatFour);

    // member.showMemberInfo();
  }

  public void start() {
    ConsoleUi ui = new ConsoleUi();
    String action = ui.startUi();
    handleInitialAction(ui, action);
  }

  public void handleInitialAction(ConsoleUi ui, String action) {
    switch (action) {
      case "1":
        ui.createMemberView();
        break;
      case "2":
        System.out.print("MEMBERS");
        break;
      case "3":
        ui.selectMember();
        break;
    }
  }
}
