package com.studies.task.StreamTasks.StatesTask;

import java.util.Arrays;
import java.util.List;

public class StatesData {

    public static List<State> getAll(){

        return Arrays.asList(
                new State("Florida", Arrays.asList("Miami", "Tampa", "Orlando")),
                new State("New York", Arrays.asList("New York", "Albany", "Buffalo")),
                new State("California", Arrays.asList("Los Angeles", "San Francisco", "San Diego")));

    }




}
