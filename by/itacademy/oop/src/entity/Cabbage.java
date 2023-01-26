package entity;

import java.util.StringJoiner;

public class Cabbage extends Vegetables{
    private boolean stateOfFreshess;

    public Cabbage(String name, boolean stateOfFreshess, int weight, int calories, int price) {
        super(name, weight, calories, price);
        this.stateOfFreshess = stateOfFreshess;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Cabbage.class.getSimpleName() + "[", "]")
                .add(super.toString() + "stateOfFreshess=" + stateOfFreshess)
                .toString();
    }

    public boolean isStateOfFreshess() {
        return stateOfFreshess;
    }

    public void setStateOfFreshess(boolean stateOfFreshess) {
        this.stateOfFreshess = stateOfFreshess;
    }
}
