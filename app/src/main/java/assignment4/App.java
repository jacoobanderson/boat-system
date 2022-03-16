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
    Data data = new Data();
    ConsoleUi ui = new ConsoleUi();
    app.start(ui, data);
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

  public void start(ConsoleUi ui, Data data) {
    String action = ui.startUi();
    handleInitialAction(ui, action, data);
  }

  public void exit() {
    return;
  }

  public void handleInitialAction(ConsoleUi ui, String action, Data data) {
    switch (action) {
      case "1":
        String[] createdMember = ui.createMemberView();
        data.addMember(createdMember[0], createdMember[1]);
        start(ui, data);
        break;
      case "2":
        data.listMembers();
        ui.goToMainMenu();
        start(ui, data);
        break;
      case "3":
        String uniqueId = ui.selectMember();
        data.selectMember(uniqueId);
        String newAction = ui.selectedMemberView();
        handleSelectedMember(ui, newAction, data, uniqueId);
        break;
      case "4":
        ui.exit();
        exit();
        break;
    }
  }

  public void handleSelectedMember(ConsoleUi ui, String action, Data data, String id) {
    switch (action) {
      case "1":
        data.deleteMember(id);
        start(ui, data);
        break;
      case "2":
        String newAction = ui.addBoatView();
        handleAddBoat(ui, newAction, data, id);
        break;
      case "3":
        start(ui, data);
        break;
    }
  }

  public void handleAddBoat(ConsoleUi ui, String action, Data data, String id) {
    switch (action) {
      case "1":
        Member member = data.getMemberById(id);
        String[] canoe = ui.canoeView();
        data.addCanoe(canoe[0], canoe[1], Integer.parseInt(canoe[2]), member);
        start(ui, data);
        break;
      case "2":
        String[] motorboat = ui.motorboatView();
        break;
      case "3":
        String[] motorsailer = ui.motorsailerView();
        break;
      case "4":
        String[] sailboat = ui.sailboatView();
        break;
    }
  }
}