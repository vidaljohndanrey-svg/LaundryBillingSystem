
package LaunSys;
public class WashDryService extends LaundryService {

    public WashDryService() {
        super(40);
    }

    @Override
    public double calculateBill(double weight) {
        return weight * ratePerKg;
    }
}
