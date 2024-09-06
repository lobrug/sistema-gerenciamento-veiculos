package obj;

public class Car extends Vehicle {
    private int doorNumber;

    public Car(String brand, String model, Fuel fuelType, int doorNumber) {
        super(brand, model, fuelType);
        this.doorNumber = doorNumber;
    }



    @Override
    public double operationCost(double kmRoadead) {
        return kmRoadead * (double)fuelType.getFuelCost();
    }

    @Override
    public void vehicleDetails() {
        System.out.println("Car Details");
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Fuel Type: " + this.fuelType);
        System.out.println("Door Number: " + this.doorNumber);
    }


}
