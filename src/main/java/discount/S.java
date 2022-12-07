package discount;

public class S implements Discountable{
    @Override
    public double discount(double bill) {

        return  bill - (bill * 0.1);

    }

    @Override
    public char Discountype() {
        return 'S';
    }
}
