package discount;

public class CustomerOrder {

    private String customerName;
    private double billAmount;
    private char discountType;
    private Discountable discount;

    public CustomerOrder(String customerName, double billAmount, Discountable discount) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.discount = discount;

    }

    public double getBillAmount() {
        return discount.discount(billAmount);
    }

    public void setDiscount(Discountable discount) {
        this.discount = discount;
    }

    public char getDiscountType() {
        return discount.Discountype();
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + billAmount
                + ", discountType=" + discountType
                + '}';
    }

}
