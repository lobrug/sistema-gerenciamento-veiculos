package obj;

public class Motorcycle extends Vehicle {
    int cylinders;

    public Motorcycle(String brand, String model, Fuel fuelType, int cylinders) {
        super(brand, model, fuelType);
        this.cylinders = cylinders;
    }

    @Override
    public double operationCost(double kmRoadead) {
        return kmRoadead * fuelType.getFuelCost() * 0.8;
    }

    @Override
    public void vehicleDetails() {
        System.out.println("Motorcycle Details");
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Fuel Type: " + this.fuelType);
        System.out.println("Cylinders: " + this.cylinders);

    }
}
