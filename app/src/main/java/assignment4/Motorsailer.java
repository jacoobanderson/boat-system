package assignment4;

public class Motorsailer extends Boat {
    private int enginePower;
    private int depth;

    public Motorsailer() {
    }

    public Motorsailer(String name, String type, int length, int enginePower, int depth) {
        super(name, type, length);
        setEnginePower(enginePower);
        setdepth(depth);
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setdepth(int depth) {
        this.depth = depth;
    }

    public int getdepth() {
        return depth;
    }

    public void showBoatInfo() {
        System.out.println("Name: " + super.getName());
        System.out.println("Type: " + super.getType());
        System.out.println("Length: " + super.getLength() + "m");
        System.out.println("Engine Power: " + getEnginePower() + "hp");
        System.out.println("Depth: " + getdepth() + "m");
    }
}