package obj;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected Fuel fuelType;

    public Vehicle(String brand, String model, Fuel fuelType) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
    }

    public abstract double operationCost(double kmRoadead);
    public abstract void vehicleDetails();
}
