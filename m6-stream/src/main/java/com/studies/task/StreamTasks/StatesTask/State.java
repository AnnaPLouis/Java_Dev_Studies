package com.studies.task.StreamTasks.StatesTask;

import java.util.ArrayList;
import java.util.List;

public class State {


    private String name;
    private List<String> cities = new ArrayList<>();

    public State(String name, List<String> cities) {
        this.name = name;
        this.cities = cities;
    }

    public void addCity(String city){
        cities.add(city);
    }
    public List<String> getCities(){
        return this.cities;
    }
}