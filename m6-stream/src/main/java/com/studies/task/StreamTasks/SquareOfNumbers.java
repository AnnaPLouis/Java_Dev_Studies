package com.studies.task.StreamTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfNumbers {

    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,2,3,4,5));

        List<Integer> squaredNumbers = numbers.stream().map(p -> p*p).collect(Collectors.toList());

        System.out.println(squaredNumbers);


        //Given a list of numbers how would you return a list of the square of each number?
        // For example, given [1,2,3,4,5] you should return [1,4,9,16,25]
    }
}
