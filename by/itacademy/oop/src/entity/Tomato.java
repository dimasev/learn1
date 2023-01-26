package entity;

import java.util.StringJoiner;

public class Tomato extends Vegetables{
    private boolean stateOfPurity;

    public Tomato(String name, boolean stateOfPurity, int weight, int calories, int price) {
        super(name, weight, calories, price);
        this.stateOfPurity = stateOfPurity;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Tomato.class.getSimpleName() + "[", "]")
                .add(super.toString() + "stateOfPurity=" + stateOfPurity)
                .toString();
    }

    public boolean isStateOfPurity() {
        return stateOfPurity;
    }

    public void setStateOfPurity(boolean stateOfPurity) {
        this.stateOfPurity = stateOfPurity;
    }
}
