package discount;

public class NoDiscount implements Discountable {
    @Override
    public double discount(double bill) {
        return bill;
    }

    @Override
    public char Discountype() {
        return 0;
    }


}
