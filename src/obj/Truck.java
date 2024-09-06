package obj;

public class Truck extends Vehicle {
    int loadCapacity;

    public Truck(String brand, String model, Fuel fuelType, int loadCapacity) {
        super(brand, model, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double operationCost(double kmRoadead) {
        return kmRoadead * fuelType.getFuelCost() * 1.5;
    }

    @Override
    public void vehicleDetails() {
        System.out.println("Truck Details");
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Fuel Type: " + this.fuelType);
        System.out.println("Load Capacity: " + this.loadCapacity);

    }
}
