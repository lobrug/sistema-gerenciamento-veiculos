package obj;

public enum Fuel {
    GASOLINA(5), DIESEL(3), ELETRICO(2);

    private final double fuelCost;

    Fuel(int fuelCost) {
        this.fuelCost = fuelCost;
    }

    public double getFuelCost() {
        return fuelCost;
    }
}
