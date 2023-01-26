package service.impl;

import entity.*;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.SaladService;

import java.util.ArrayList;
import java.util.List;

public class SaladServiceImpl implements SaladService {
    static Logger logger = LogManager.getLogger();
    @Override
    public int calculatePriceSalad(List<Vegetables> list) {
        int price = 0;
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                price += list.get(i).getPrice();
            }
        }
        return price;
    }

    @Override
    public void washingTomato(Tomato tomato) {
        boolean condition = tomato.isStateOfPurity();
        if (!condition) {
            tomato.setStateOfPurity(true);
        }
    }

    @Override
    public void peelingCucumber(Cucumber cucumber) {
        boolean condition = cucumber.isStateOfPeel();
        if (!condition) {
            cucumber.setStateOfPeel(true);
        }
    }

    @Override
    public void replacementCabbage(Cabbage cabbage) {
        boolean condition = cabbage.isStateOfFreshess();
        if (!condition) {
            cabbage.setStateOfFreshess(true);
        }
    }

    @Override
    public void preparftionOfVegetables(List <Vegetables> notVerifiedVegetables) {
        List<Vegetables> vegetables= notVerifiedVegetables;
        for(Vegetables vb: vegetables){
            switch (vb.getName()){
                case "Cucumber" -> peelingCucumber((Cucumber) vb);
                case "Cabbage" -> replacementCabbage((Cabbage) vb);
                case "Tomato" -> washingTomato((Tomato) vb);
            }
        }
    }

    @Override
    public void searchingForVegetablesByCalories(Salad salad, int calories) {
        List<Vegetables> list = salad.getVegetables();
        List<Vegetables> list1 = new ArrayList<>();
        Vegetables vegetables = null;
        for(Vegetables vb:list){
            if (vb.getCalories()==calories){
                list1.add(vb);
            }
        }
        if (list1.size() != 0){
            for (Vegetables vb: list1)
                System.out.println(vb);
        }else{
            logger.log(Level.ERROR, "No vegetables");
        }
    }

}
