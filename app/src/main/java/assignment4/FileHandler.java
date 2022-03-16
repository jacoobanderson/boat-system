package assignment4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler {
    public void saveData(ArrayList<Member> members) {
        try {
            File data = new File("registry.data");
            if (!data.createNewFile()) {
                data.delete();
                data.createNewFile();
            }

            FileWriter myWriter = new FileWriter("registry.data");
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
                    }
                }
            }
            myWriter.close();
        } catch (IOException e) {
            return;
        }
    }
}
