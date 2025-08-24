package in.kgcoding.inheritance;

public class Vehicle {

    protected int numberOfTiers; // (protected = default + childs)

    public void setNumberOfTiers(int numberOfTiers) {
        this.numberOfTiers = numberOfTiers;
    }

    @Override
    public String toString() {
        return "Vehicle no of tires: " + numberOfTiers;
    }

    public void commute() {
        System.out.printf("I am going from place A to place B using %d tiers\n", numberOfTiers);
    }
}
