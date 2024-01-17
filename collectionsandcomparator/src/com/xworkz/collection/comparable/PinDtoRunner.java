package com.xworkz.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PinDtoRunner {
    public static void main(String[] args) {
        PinDTO pinDTO=new PinDTO(5,3,6);
        PinDTO pinDTO1=new PinDTO(4,2,2);
        PinDTO pinDTO2=new PinDTO(6,4,5);
        PinDTO pinDTO3=new PinDTO(3,2,3);
        PinDTO pinDTO4=new PinDTO(7,6,1);

        List<PinDTO> list=new ArrayList<>();

        list.add(pinDTO);
        list.add(pinDTO1);
        list.add(pinDTO2);
        list.add(pinDTO3);
        list.add(pinDTO4);

        Collections.sort(list);
        for (PinDTO val:list
        ) {
            System.out.println(val);
        }

    }
}
