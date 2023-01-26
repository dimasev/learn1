package entity;

import java.util.StringJoiner;

public class Cucumber extends Vegetables{
    private boolean stateOfPeel;

    public Cucumber(String name, boolean stateOfPeel, int weight, int calories, int price) {
        super(name, weight, calories, price);
        this.stateOfPeel = stateOfPeel;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Cucumber.class.getSimpleName() +  "[", "]")
                .add(super.toString() + "stateOfPeel=" + stateOfPeel)
                .toString();
    }

    public boolean isStateOfPeel() {
        return stateOfPeel;
    }

    public void setStateOfPeel(boolean stateOfPeel) {
        this.stateOfPeel = stateOfPeel;
    }
}
