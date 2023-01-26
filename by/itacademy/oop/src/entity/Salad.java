package entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.StringJoiner;

import static util.GenerateId.generateNextId;

public class Salad {
    private int saladId;
    private String name;
    private List<Vegetables> vegetables;

    public Salad(String name, List<Vegetables> vegetables) {
        this.name = name;
        this.vegetables = vegetables;
        this.saladId = generateNextId();
    }

    public int getSaladId() {
        return saladId;
    }

    public void setSaladId(int saladId) {
        this.saladId = saladId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vegetables> getVegetables() {
        return vegetables;
    }

    public void setVegetables(List<Vegetables> vegetables) {
        this.vegetables = vegetables;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Salad.class.getSimpleName() + "[", "]")
                .add("saladId=" + saladId)
                .add("name='" + name + "'")
                .add("vegetables=" + vegetables)
                .toString();
    }
}
