package com.epam.day1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReindeerTest {

    @Test
    public void canCreateaReindeer() {

        Reindeer reindeer = new Reindeer();
        assertNotNull(reindeer);
    }

    @Test
    public void canAddCaloriesToFoodPackage() {

        Reindeer reindeer = new Reindeer();

        reindeer.collectPortionOfFoodFromResources(10);
        reindeer.collectPortionOfFoodFromResources(20);
        reindeer.collectPortionOfFoodFromResources(70);
        int sumOfCaloriesInFood = reindeer.getSumOfCaloriesInFood();

        assertEquals(100, sumOfCaloriesInFood);
    }

}