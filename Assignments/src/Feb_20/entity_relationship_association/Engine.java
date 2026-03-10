package Feb_20.entity_relationship_association;

public class Engine {

    private double cc;
    private String coolingSystem;
    private int cylinderNumber;

    public Engine(double cc, String coolingSystem, int cylinderNumber) {
        this.cc = cc;
        this.coolingSystem = coolingSystem;
        this.cylinderNumber = cylinderNumber;
    }

    public double getCc() {
        return cc;
    }

    public String getCoolingSystem() {
        return coolingSystem;
    }

    public int getCylinderNumber() {
        return cylinderNumber;
    }

    public void displayEngineDetails() {
        System.out.println("Engine Details:");
        System.out.println("---------------------");
        System.out.println("CC: " + cc);
        System.out.println("Cooling System: " + coolingSystem);
        System.out.println("Cylinder Number: " + cylinderNumber);
        System.out.println();
    }
}