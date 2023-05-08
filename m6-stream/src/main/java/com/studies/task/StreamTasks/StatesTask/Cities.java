package com.studies.task.StreamTasks.StatesTask;

public class Cities {

    public static void main(String[] args) {


        StatesData.getAll().stream().map(State::getCities).forEach(System.out::println);

    }
}
