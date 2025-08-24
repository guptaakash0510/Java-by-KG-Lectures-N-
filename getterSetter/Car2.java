package getterSetter;

public class Car2 {

    private String color;  // public
    private String model;  // public
    private double fuelLevel;
    private long costOfPurchase;  // default

    public Car2(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    public String getColor(){
        return color;
    }

   public void setColor(String color) {
        if (color.equals("Yellow")) {
            System.out.println("Pagal hai kya");
        }
        else {
            this.color = color;
        }
    }

    public String getModel(){
        return model;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}
