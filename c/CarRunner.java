package c;

public class CarRunner {

    public static void main(String[] args) {

        HybridVehicle car = new HybridVehicle();

        car.setCostPerGallon(3.50);
        car.setCostPerKWh(0.24);

        double mpg = car.calcMPG(120, 20);

        double mpw = car.calcMPW(300, 70);

        double average = (mpg + mpw) / 2;
        
        System.out.println("Your gasoline MPG is: " + mpg);
        System.out.println("Your electric MPW is: " + mpw);
        System.out.println("Your hybrid average MPG is: " + average);
        System.out.println("Your gasoline cost per gallon is: $" + car.getCostPerGallon());
        System.out.println("Your electric cost per kWh is: $" + car.getCostPerKWh());
    }
}