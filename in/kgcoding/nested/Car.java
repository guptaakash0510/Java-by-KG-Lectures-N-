package in.kgcoding.nested;

public class Car {

    private int noOfDoors;

    public void repair() {

    }

    private class tire {
        private double width;
        private double pressure;
        private String material;

        public void inflate() {
            noOfDoors = 4 ;
        }
    }
}
