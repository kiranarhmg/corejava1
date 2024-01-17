package com.xworkz.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WingsDtoRunner {
    public static void main(String[] args) {
        WingsDTO wingsDTO=new WingsDTO(10,200,"red");
        WingsDTO wingsDTO1=new WingsDTO(15,300,"black");
        WingsDTO wingsDTO2=new WingsDTO(20,400,"green");
        WingsDTO wingsDTO3=new WingsDTO(18,230,"yellow");
        WingsDTO wingsDTO4=new WingsDTO(16,220,"red");

        List<WingsDTO> list=new ArrayList<>();
        list.add(wingsDTO);
        list.add(wingsDTO1);
        list.add(wingsDTO2);
        list.add(wingsDTO3);
        list.add(wingsDTO4);

        Collections.sort(list);
        for (WingsDTO val:list
        ) {
            System.out.println(val);
        }
    }
}
