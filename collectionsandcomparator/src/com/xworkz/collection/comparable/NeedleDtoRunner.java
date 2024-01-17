package com.xworkz.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NeedleDtoRunner {
    public static void main(String[] args) {
        NeedleDTO needleDTO=new NeedleDTO("cipla",20,5);
        NeedleDTO needleDTO1=new NeedleDTO("swift",20,5);
        NeedleDTO needleDTO2=new NeedleDTO("apex",20,5);
        NeedleDTO needleDTO3=new NeedleDTO("sharp",20,5);
        NeedleDTO needleDTO4=new NeedleDTO("silver",20,5);

        List<NeedleDTO> list=new ArrayList<>();
        list.add(needleDTO);
        list.add(needleDTO1);
        list.add(needleDTO2);
        list.add(needleDTO3);
        list.add(needleDTO4);

        Collections.sort(list);
        for (NeedleDTO val:list
        ) {
            System.out.println(val);
        }
    }
}
