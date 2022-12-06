package com.epam.day1;

import java.util.ArrayList;
import java.util.List;

public class Statistics {

    CollectorOfFoodPortion collectorOfFoodPortion = new CollectorOfFoodPortion();
    DataWithFoodPackages dataWithFoodPackages = new DataWithFoodPackagesFromFile();
    final List<Reindeer> listOfReindeerWithFoodPackages = collectorOfFoodPortion.getListOfReindeerWithFoodPackages(
            dataWithFoodPackages);

    public int getMaxValueOfCaloriesCarryingByOneReindeer() {
        final Reindeer reindeerWithMaxValueOfCalories = getReindeerWithMaxValueOfCalories(
                listOfReindeerWithFoodPackages);
        return reindeerWithMaxValueOfCalories.getSumOfCaloriesInFood();
    }

    private Reindeer getReindeerWithMaxValueOfCalories(List<Reindeer> listOfReindeerWithFoodPackages) {

        Reindeer reindeerWithMaxValueOfCalories = new Reindeer();
        for (Reindeer reindeer : listOfReindeerWithFoodPackages) {
            if (reindeer.getSumOfCaloriesInFood() > reindeerWithMaxValueOfCalories.getSumOfCaloriesInFood()) {
                reindeerWithMaxValueOfCalories = reindeer;
            }
        }
        return reindeerWithMaxValueOfCalories;
    }

    public int getMaxValueOfCaloriesCarryingByThreeReindeer() {

        List<Reindeer> listOfReinderForCalculation = listOfReindeerWithFoodPackages;
        List<Reindeer> threeReindeerWithMaxValueOfCalories = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Reindeer reindeerWithMaxValueOfCalories = getReindeerWithMaxValueOfCalories(listOfReinderForCalculation);
            threeReindeerWithMaxValueOfCalories.add(reindeerWithMaxValueOfCalories);
            listOfReinderForCalculation.remove(reindeerWithMaxValueOfCalories);
        }

        int maxValueOfCalories = 0;
        for (Reindeer threeReindeerWithMaxValueOfCalory : threeReindeerWithMaxValueOfCalories) {
            maxValueOfCalories += threeReindeerWithMaxValueOfCalory.getSumOfCaloriesInFood();
        }

        return maxValueOfCalories;
    }
}
