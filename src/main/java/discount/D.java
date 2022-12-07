package discount;

public class D implements Discountable{
    @Override
    public double discount(double bill) {

       return bill - (bill * 0.5);

    }

    @Override
    public char Discountype() {
        return 'D';
    }
}
