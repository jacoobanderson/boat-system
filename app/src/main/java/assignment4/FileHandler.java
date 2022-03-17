package assignment4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
  public void saveData(ArrayList<Member> members) {
    try {
      File data = new File("registry.data");
      if (!data.createNewFile()) {
        if(data.delete() && data.createNewFile()) {
          System.out.println("Successfully saved the data");
        }
      }
      FileOutputStream fileStream = new FileOutputStream("registry.data");
      OutputStreamWriter myWriter = new OutputStreamWriter(fileStream, "UTF-8");
      
      for (int i = 0; i < members.size(); i++) {
        Member member = members.get(i);
        ArrayList<Boat> boats = member.getBoats();
        myWriter.write("MEMBER:"+ member.getName() + ":" + member.getEmail() + ":" + member.getUniqueId() + "\n");
        for (int j = 0; j < boats.size(); j++) {
          String type = boats.get(j).getType();
          String[] details = boats.get(j).getBoatInfo();
          switch (type) {
            case "Canoe":
              myWriter.write("BOAT:" + details[0] + ":" + details[1] + ":" + details[2] + "\n");
              break;
            case "Motorboat":
              myWriter.write("BOAT:" + details[0] + ":" + details[1] + ":" + details[2] + ":" + details[3] + "\n");
              break;
            case "Motorsailer":
              myWriter.write("BOAT:" + details[0] + ":" + details[1] + ":" + details[2] + ":" + details[3] + ":" + details[4] + "\n");
              break;
            case "Sailboat":
              myWriter.write("BOAT:" + details[0] + ":" + details[1] + ":" + details[2] + ":" + details[3] + "\n");
              break;
            default:
              break;
          }
        }
      }
      myWriter.close();
    } catch (IOException e) {
      return;
    }
  }

  public void loadData(ArrayList<Member> members) {
    File loadData = new File("registry.data");
    if (loadData.exists()) {
      try {
        Scanner readData = new Scanner(loadData, "UTF-8");
        while (readData.hasNext()) {
          String[] details = readData.nextLine().split(":");
          if (details[0].equals("MEMBER")) {
            Member member = new Member(details[1], details[2], details[3]);
            members.add(member);
          }

          if (details[0].equals("BOAT")) {
            Member lastMember = members.get(members.size() - 1);
            switch (details[2]) {
              case "Canoe":
                Canoe canoe = new Canoe(details[1], details[2], Integer.parseInt(details[3]));
                lastMember.addBoat(canoe);
                break;
              case "Motorboat":
                Motorboat motorboat = new Motorboat(details[1], details[2], Integer.parseInt(details[3]), Integer.parseInt(details[4]));
                lastMember.addBoat(motorboat);
                break;
              case "Motorsailer":
                Motorsailer motorsailer = new Motorsailer(details[1], details[2], Integer.parseInt(details[3]), Integer.parseInt(details[4]), Integer.parseInt(details[5]));
                lastMember.addBoat(motorsailer);
                break;
              case "Sailboat":
                Sailboat sailboat = new Sailboat(details[1], details[2], Integer.parseInt(details[3]), Integer.parseInt(details[4]));
                lastMember.addBoat(sailboat);
                break;
              default:
                break;
            }
          }
        }
        readData.close();
      } catch (FileNotFoundException e) {
        return;
      }
    }
  }
}
