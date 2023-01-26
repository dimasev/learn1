package main;

import comparator.PriceComarator;
import createvegetables.CreateVegetables;
import createvegetables.impl.CreateVegetablesImpl;
import customexeption.CustomException;
import entity.Cucumber;
import entity.Salad;
import entity.Vegetables;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import reader.ReaderFile;
import reader.impl.ReaderFileImpl;
import service.SaladService;
import service.impl.SaladServiceImpl;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CustomException {
        Logger logger = LogManager.getLogger();
        ReaderFile readerFile = new ReaderFileImpl();
        CreateVegetables createVegetables = new CreateVegetablesImpl();
        SaladService saladService = new SaladServiceImpl();
        File file = new File("data\\doc.txt");
        if (!readerFile.isFileEmpty(file)){
        List<String> stringVegetable = readerFile.readFile(file);
        List<Vegetables> billet = createVegetables.createBillet(stringVegetable);
        saladService.preparftionOfVegetables(billet);
        Salad salad =  new Salad("Caesar", billet);
        System.out.println(saladService.calculatePriceSalad(billet));
        Collections.sort(billet, new PriceComarator());
        for (Vegetables vb : billet){
        System.out.println(vb.toString());}
        saladService.searchingForVegetablesByCalories(salad, 523);
            }
        else{ throw new CustomException("File is empty");}
    }
}
