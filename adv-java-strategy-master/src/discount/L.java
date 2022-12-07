package discount;

public class L implements Discountable{
    @Override
    public double discount(double bill) {

        return  bill - (bill * 0.75);

    }

    @Override
    public char Discountype() {
        return 'L';
    }
}
