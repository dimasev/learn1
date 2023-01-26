package service;

import entity.*;

import java.util.List;

public interface SaladService {
    int calculatePriceSalad(List<Vegetables> list);
    void washingTomato(Tomato tomato);
    void peelingCucumber(Cucumber cucumber);
    void replacementCabbage(Cabbage cabbage);
    void preparftionOfVegetables(List <Vegetables> vegetables);
    void searchingForVegetablesByCalories(Salad salad, int calories);

}
