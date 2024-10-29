package test;

public class Car {
    private String make;
    private String model;
    private double mileage;
    private int year;

    Car(String make, String model, double mileage, int year) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car make:" + make +
                ", car model:" + model  +
                ", car mileage:" + mileage +
                ", car year:" + year;
    }
}
