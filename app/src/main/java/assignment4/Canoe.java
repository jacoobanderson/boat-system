package assignment4;

public class Canoe extends Boat {

    public Canoe() {
    }

    public Canoe(String name, String type, int length) {
        super(name, type, length);
    }

    public void showBoatInfo() {
        System.out.println("Name: " + super.getName());
        System.out.println("Type: " + super.getType());
        System.out.println("Length: " + super.getLength() + "m");
    }
}