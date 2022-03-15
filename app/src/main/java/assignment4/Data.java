package assignment4;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

public class Data {
    private ArrayList<Member> members = new ArrayList<Member>();

    public void addMember(String name, String email) {
        // CHECK IF UNIQUE IF NOT, GENERATE NEW.
        String id = generateId();
        Member member = new Member(name, email, id);
        members.add(member);
    }

     public String generateId() {
        String numberString = "1234567890";
        String characterString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        StringBuilder string = new StringBuilder();
        Random rnd = new Random();

        while (string.length() < 6) { 
            int index = (int) (rnd.nextFloat() * characterString.length());
            int numberIndex = (int) (rnd.nextFloat() * numberString.length());
            string.append(characterString.charAt(index));
            string.append(numberString.charAt(numberIndex));
        }

        String randomString = string.toString();
        return randomString;
     }

     public void listMembers() {
        for (int i = 0; i < members.size(); i++) {
            System.out.println("Name: " + members.get(i).getName());
            System.out.println("ID: " + members.get(i).getUniqueId() + "\n");
        }
     }

     public void selectMember(String id) {
        for (Member member : members) {
            if (member.getUniqueId().equals(id)) {
                member.showMemberInfo();
            }
        }
     }
}
