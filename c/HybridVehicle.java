package c;

public class HybridVehicle implements Gasoline, Electric {
    private double costPerGallon;
    private double costPerKWh;

    public double calcMPG(double miles, double gallons) {
        if (gallons <= 0) {
            throw new IllegalArgumentException("Your gallons must be more than 0");
        }

        return miles / gallons;
    }

    public void setCostPerGallon(double cost) {
        costPerGallon = cost;
    }
    
    public double getCostPerGallon() {
        return costPerGallon;
    }
    
    public double calcMPW(double miles, double kWh) {
        if (kWh <= 0) {
            throw new IllegalArgumentException("Your kWh must be more than 0");
        }
        
        return (miles / kWh) * 33.7;
    }

    public void setCostPerKWh(double cost) {
        costPerKWh = cost;
    }

    public double getCostPerKWh() {
        return costPerKWh;
    }
}