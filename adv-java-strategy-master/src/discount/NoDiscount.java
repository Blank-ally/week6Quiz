package discount;

import java.lang.constant.Constable;

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
