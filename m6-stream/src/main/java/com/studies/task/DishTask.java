package com.studies.task;

import java.util.Comparator;

import static java.util.Comparator.comparing;

public class DishTask {

    public static void main(String[] args) {


        //Print all dish names that are less than 400 calories

        DishData.getAll().stream().filter(p -> p.getCalories()<400).map(Dish::getName).forEach(System.out::println);

        //Print the length of the name of each dish

        DishData.getAll().forEach(p-> System.out.println(p.getName().length()));

        //Print three high caloric dish name (>300)

        DishData.getAll().stream().filter(p-> p.getCalories()>300).limit(3).forEach(p-> System.out.println(p.getName()));

        //Print all dish name that are below 400 calories in sorted

        DishData.getAll().stream().filter(p -> p.getCalories()<400).sorted(comparing(Dish::getCalories).reversed()).forEach(p -> System.out.println(p.getName()));











    }
}