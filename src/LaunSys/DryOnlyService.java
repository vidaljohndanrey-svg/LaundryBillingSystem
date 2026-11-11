
package LaunSys;
public class DryOnlyService extends LaundryService {

    public DryOnlyService() {
        super(20);
    }

    @Override
    public double calculateBill(double weight) {
        return weight * ratePerKg;
    }
}
