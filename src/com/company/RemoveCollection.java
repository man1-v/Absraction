package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveCollection {
    static void myMethod(){
        List<String> list = new ArrayList<>();
        list.add("Sam");
        list.add("Manny");
        list.add("Mansur");
        list.add("Jurabek");
        list.add("Sam");
        System.out.println("okkey" + list);
//       list da 2ta bir xil value berilganda ikkalasini ham pirnt qiladi

        Set<String>myset = new HashSet<>();
        myset.add("Sam");
        myset.add("Manny");
        myset.add("Mansur");
        myset.add("Jurabek");
        myset.add("Sam");
        System.out.println("keys"+ myset);
//        Set da 2ta bir xil value bersak faqat bittasini pirnt qiladi
    }

}
