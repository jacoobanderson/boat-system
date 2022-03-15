package assignment4;

public class Motorboat extends Boat {
    private int enginePower;

    public Motorboat() {
    }

    public Motorboat(String name, String type, int length, int enginerPower) {
        super(name, type, length);
        setEnginePower(enginePower);
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void showBoatInfo() {
        System.out.println("Name: " + super.getName());
        System.out.println("Type: " + super.getType());
        System.out.println("Length: " + super.getLength() + "m");
        System.out.println("Engine Power: " + getEnginePower() + "hp");
    }
}
