package comparator;

import entity.Vegetables;

import java.util.Comparator;

public class PriceComarator implements Comparator<Vegetables> {
    @Override
    public int compare(Vegetables v1, Vegetables v2) {
        return v1.getPrice()- v2.getPrice();
    }
}
