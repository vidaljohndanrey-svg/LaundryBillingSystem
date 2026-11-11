
package LaunSys;

public abstract class LaundryService {

    protected double ratePerKg;

    public LaundryService(double ratePerKg) {
        this.ratePerKg = ratePerKg;
    }

    public double getRatePerKg() {
        return ratePerKg;
    }

    public abstract double calculateBill(double weight);
}

