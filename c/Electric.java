package c;

public interface Electric {
    double calcMPW(double miles, double kWh);
    void setCostPerKWh(double cost);
    double getCostPerKWh();
}