package com.epam.day1;

import java.util.ArrayList;
import java.util.List;

class Reindeer {

    private final List<Integer> listOfFoodPortionWithKiloCalories = new ArrayList<>();

    public Reindeer() {
    }

    public void collectPortionOfFoodFromResources(int foodPortion) {
        listOfFoodPortionWithKiloCalories.add(foodPortion);
    }

    public int getSumOfCaloriesInFood() {
        return listOfFoodPortionWithKiloCalories.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
