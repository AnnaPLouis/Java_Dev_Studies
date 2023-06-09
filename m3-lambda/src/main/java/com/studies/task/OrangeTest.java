package com.studies.task;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {

    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<Orange>();
        inventory.add(new Orange(300, Color1.YELLOW));
        inventory.add(new Orange(100, Color1.ORANGE));
        inventory.add(new Orange(200, Color1.YELLOW));
        inventory.add(new Orange(50, Color1.ORANGE));

        OrangeFormatter orangeLambda = orange -> "An orange of" + orange.getWeight() + "g";
        prettyPrintApple(inventory,orangeLambda);

        prettyPrintApple(inventory,orange -> "An orange of" + orange.getWeight() + "g");

        System.out.println("**************************************");

        OrangeFormatter fancyFormatter = orange -> {
            String ch = orange.getWeight() > 200 ? "Heavy" : "Light";
            return  "A" + ch + " " + orange.getColor() + " orange";
        };

        prettyPrintApple(inventory,fancyFormatter);

    }

    //Task
    //Convert to ready functional interface

    private static void prettyPrintApple(List<Orange> inventory,OrangeFormatter formatter){
        for(Orange orange : inventory){
            String output = formatter.accept(orange);
            System.out.println(output);
        }
    }




}