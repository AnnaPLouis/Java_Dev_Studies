package com.studies.task.StreamTasks;

import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {

        // Fibonacci first 20 numbers

        Stream.iterate(new Integer[] {0,1}, s -> new Integer[]{s[1], s[0] + s[1]})
                .limit(20)
                .map(s -> s[0])
                .forEach(System.out::println);

        System.out.println("---------------------------------------------------------------");

        //Fibonacci tuples as pairs

        Stream.iterate(new Integer[] {0,1}, s -> new Integer[]{s[1], s[0] + s[1]})
                .limit(20)
                .forEach(t -> System.out.println("("+t[0]+","+t[1]+")"));

    }
}

