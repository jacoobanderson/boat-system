package assignment4;

import java.util.ArrayList;
import java.util.Random;

public class Data {
    private ArrayList<Member> members = new ArrayList<Member>();

    public void addMember(String name, String email) {
        String id = generateId();

        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getEmail().equals(email)) {
                email = "none";
            } else if (members.get(i).getUniqueId() == id) {
                id = generateId();
            }
        }
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

     public void selectBoat(String name, String id) {
        Member member = getMemberById(id);
        ArrayList<Boat> boats = member.getBoats();
        for (int i = 0; i < boats.size(); i++) {
            if (boats.get(i).getName().equals(name)) {
                boats.get(i).showBoatInfo();
            }
        }
     }

     public void deleteBoat(String name, String id) {
        Member member = getMemberById(id);
        ArrayList<Boat> boats = member.getBoats();
        for (int i = 0; i < boats.size(); i++) {
            if (boats.get(i).getName().equals(name)) {
                boats.remove(i);
            }
        }
     }

     public void deleteMember(String id) {
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getUniqueId().equals(id)) {
                members.remove(i);
            }
        }
     }

     public Member getMemberById(String id) {
        Member idMember = null;
        for (Member member : members) {
            if (member.getUniqueId().equals(id)) {
                idMember = member;
            }
        }
        return idMember;
     }

     public void addCanoe(String name, String type, int length, Member member) {
        Canoe canoe = new Canoe(name, type, length);
        member.addBoat(canoe);
     }

     public void addMotorboat(String name, String type, int length, int enginePower, Member member) {
        Motorboat motorboat = new Motorboat(name, type, length, enginePower);
        member.addBoat(motorboat);
     }

     public void addMotorsailer(String name, String type, int length, int enginePower, int depth, Member member) {
        Motorsailer motorsailer = new Motorsailer(name, type, length, enginePower, depth);
        member.addBoat(motorsailer);
     }

     public void addSailboat(String name, String type, int length, int depth, Member member) {
        Sailboat sailboat = new Sailboat(name, type, length, depth);
        member.addBoat(sailboat);
     }

     public void save() {
         FileHandler saveFile = new FileHandler();
         saveFile.saveData(members);
     }
}
