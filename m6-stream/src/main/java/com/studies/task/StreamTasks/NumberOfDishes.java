package com.studies.task.StreamTasks;

import com.studies.task.DishData;

import java.util.Optional;

public class NumberOfDishes {

    public static void main(String[] args) {

        Optional<Integer> numberOfDishes = DishData.getAll().stream().map(dish -> 1).reduce(Integer::sum);
        System.out.println(numberOfDishes.get());






        //How would you count the number of dishes
        // in a stream using the map and reduce methods?
    }
}
