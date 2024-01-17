package com.xworkz.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToyDtoRunner {
    public static void main(String[] args) {
        ToyDTO toyDTO=new ToyDTO("train",200,'l');
        ToyDTO toyDTO1=new ToyDTO("bus",280,'m');
        ToyDTO toyDTO2=new ToyDTO("car",220,'x');
        ToyDTO toyDTO3=new ToyDTO("doll",300,'s');
        List<ToyDTO> list=new ArrayList<>();

        list.add(toyDTO);
        list.add(toyDTO1);
        list.add(toyDTO2);
        list.add(toyDTO3);

        Collections.sort(list);
        // sorted on cost property
        for (ToyDTO val:list
        ) {
            System.out.println(val);
        }





    }
}
