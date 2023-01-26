package createvegetables;

import customexeption.CustomException;
import entity.Vegetables;

import java.util.List;

public interface CreateVegetables {
    List<Vegetables> createBillet(List<String> strings) throws CustomException;

    Vegetables createCucumber(String[] strings) throws CustomException;

    Vegetables createCabbage(String[] strings) throws CustomException;

    Vegetables createTomato(String[] strings) throws CustomException;
}
