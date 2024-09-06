import obj.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ferrari", "SF-90", Fuel.ELETRICO, 2);
        Truck truck = new Truck("Mercedes", "aw4s", Fuel.DIESEL, 5000);
        Motorcycle motorcycle = new Motorcycle("Kawazaki", "Ninja", Fuel.GASOLINA, 1000);

        double operetionCar = car.operationCost(100);
        System.out.println(operetionCar);
        double operetionTruck = truck.operationCost(500);
        System.out.println(operetionTruck);
        double operetionMotorcycle = motorcycle.operationCost(200);
        System.out.println(operetionMotorcycle);

        System.out.println("----------------");
        car.vehicleDetails();
        System.out.println("----------------");
        truck.vehicleDetails();
        System.out.println("----------------");
        motorcycle.vehicleDetails();
        System.out.println("----------------");
    }
}