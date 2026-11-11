
package LaunSys;
public class WashOnlyService extends LaundryService {

    public WashOnlyService() {
        super(25);
    }

    @Override
    public double calculateBill(double weight) {
        return weight * ratePerKg;
    }
}