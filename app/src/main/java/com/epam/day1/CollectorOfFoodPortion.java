package com.epam.day1;

import java.util.ArrayList;
import java.util.List;

public class CollectorOfFoodPortion {

    List<Reindeer> listOfReindeer = new ArrayList<>();

    public List<Reindeer> collectedPackegesOfFoodForReindeers(DataWithFoodPackages dataWithFoodPackages) {

        while (dataWithFoodPackages.hasNext()) {

            Reindeer reindeer = new Reindeer();
            String allFoodForCamel = dataWithFoodPackages.next();

            String regexForEmptyLine = "\\r?\\n|\\r";
            String[] portionedFoodsForCamel = allFoodForCamel.split(regexForEmptyLine);

            for (String singlePortionOfFood : portionedFoodsForCamel) {
                if (!singlePortionOfFood.isEmpty()) {
                    addCollectedFoodToReindeerPackage(reindeer, singlePortionOfFood);
                }
            }
            listOfReindeer.add(reindeer);
        }
        return listOfReindeer;
    }

    private static void addCollectedFoodToReindeerPackage(Reindeer reindeer, String singlePortionOfFood) {
        reindeer.collectPortionOfFoodFromResources(Integer.parseInt(singlePortionOfFood));
    }
}
