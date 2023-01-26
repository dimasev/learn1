package entity;

import java.util.StringJoiner;

public abstract class Vegetables {
    private String name;
    private int weight;
    private int calories;
    private int price;

    public Vegetables(String name, int weight, int calories, int price) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getCalories() {
        return calories;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Vegetables.class.getSimpleName() + ", ", ", ") // text output question
                .add("name='" + name + "'")
                .add("weight=" + weight)
                .add("calories=" + calories)
                .add("price=" + price)
                .toString();
    }

}
