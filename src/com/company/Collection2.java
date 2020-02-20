package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection2 {
    static void myMethod(){
//        List<String> lia = new ArrayList<>();
//        lia.add("Ezoza");
//        lia.add("Zuki");
//        lia.add("Asila");
//        lia.add("Men");
//        lia.add("Onasi");
//        lia.remove(3);
////        System.out.println("my family" + lia);
////        System.out.println("my family" +lia.size());
////    +variable.size() qib chaqirsa variablelarni sonini pirnt qiladi
//        System.out.println("my family" + lia);

        Set<String> cars = new HashSet<>();
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Hyundai");
        cars.add("Nexia");
        for (String car:cars) {
            System.out.println("best are cars" + cars);
        }
        for (String item : cars){
            System.out.println( "best cars" + item);
        }

    }
}
