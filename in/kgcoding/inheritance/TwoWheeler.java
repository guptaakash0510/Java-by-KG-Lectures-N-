package in.kgcoding.inheritance;

public class TwoWheeler extends Vehicle {
    TwoWheeler() {
        setNumberOfTiers(2);
        numberOfTiers = 4;
    }

    public void balance() {
        System.out.println("I am balancing on two tiers");
    }
}
