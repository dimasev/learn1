package createvegetables.impl;

import createvegetables.CreateVegetables;
import customexeption.CustomException;
import entity.Cabbage;
import entity.Cucumber;
import entity.Tomato;
import entity.Vegetables;

import java.util.ArrayList;
import java.util.List;

public class CreateVegetablesImpl implements CreateVegetables {
    @Override
    public List<Vegetables> createBillet(List<String> stringVegetable) throws CustomException {
        List<Vegetables> billet = new ArrayList<>();
        for (String str : stringVegetable) {
            String[] strings = str.split("\\s+");
            switch (strings[0]) {
                case "Cucumber" -> billet.add(createCucumber(strings));
                case "Cabbage" -> billet.add(createCabbage(strings));
                case "Tomato" -> billet.add(createTomato(strings));
                default -> {
                    break;
                }
            }
        }
        return billet;
    }

    @Override
    public Vegetables createCucumber(String[] strings) throws CustomException {
        String name = strings[0];
        boolean stateOfPeel = Boolean.parseBoolean(strings[1]);
        int price;
        int weight;
        int calories;
        List<Integer> listInt = new ArrayList<>();
        try {
            int number;
            for (int i = 2; i < strings.length; i++) {
                number = Integer.parseInt(strings[i]);
                listInt.add(number);
            }
        } catch (NumberFormatException e) {
            throw new CustomException(e);
        }
        price = listInt.get(0);
        weight = listInt.get(1);
        calories = listInt.get(2);
        return new Cucumber(name, stateOfPeel, price, weight, calories);
    }

    @Override
    public Vegetables createCabbage(String[] strings) throws CustomException {
        String name = strings[0];
        boolean stateOfFreshess = Boolean.parseBoolean(strings[1]);
        int price;
        int weight;
        int calories;
        List<Integer> listInt = new ArrayList<>();
        int number;
        for (int i = 2; i < strings.length; i++) {
            try {
                number = Integer.parseInt(strings[i]);
                listInt.add(number);

            } catch (NumberFormatException e) {
                throw new CustomException(e);
            }
        }

        price = listInt.get(0);
        weight = listInt.get(1);
        calories = listInt.get(2);

        return new Cabbage(name, stateOfFreshess, price, weight, calories);
    }

    @Override
    public Vegetables createTomato(String[] strings) throws CustomException {
        String name = strings[0];
        boolean stateOfPurity = Boolean.parseBoolean(strings[1]);
        int price;
        int weight;
        int calories;
        List<Integer> listInt = new ArrayList<>();
        int number;
        for (int i = 2; i < strings.length; i++) {
            try {
                number = Integer.parseInt(strings[i]);
                listInt.add(number);

            } catch (NumberFormatException e) {
                throw new CustomException(e);
            }
        }

        price = listInt.get(0);
        weight = listInt.get(1);
        calories = listInt.get(2);

        return new Tomato(name, stateOfPurity, price, weight, calories);
    }
}
