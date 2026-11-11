
package LaunSys;

public class Transaction {

    private String transactionNo;
    private String staffId;
    private String customerName;
    private String customerNo;
    private String serviceType;
    private double weight;
    private double totalAmount;

    public Transaction(String transactionNo,
                       String staffId,
                       String customerName,
                       String customerNo,
                       String serviceType,
                       double weight,
                       double totalAmount) {

        this.transactionNo = transactionNo;
        this.staffId = staffId;
        this.customerName = customerName;
        this.customerNo = customerNo;
        this.serviceType = serviceType;
        this.weight = weight;
        this.totalAmount = totalAmount;
    }

    public String getTransactionNo() {
        return transactionNo;
    }

    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
