package com.xworkz.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FireCrackerDtoRunner {
    public static void main(String[] args) {
        FireCrackerDTO fireCrackerDTO=new FireCrackerDTO("shivam","red",100);
        FireCrackerDTO fireCrackerDTO1=new FireCrackerDTO("ram","blue",200);
        FireCrackerDTO fireCrackerDTO2=new FireCrackerDTO("sneha","pink",300);
        FireCrackerDTO fireCrackerDTO3=new FireCrackerDTO("abhay","light blue",150);
        FireCrackerDTO fireCrackerDTO4=new FireCrackerDTO("ganesh","red",190);

        List<FireCrackerDTO> list=new ArrayList<>();
        list.add(fireCrackerDTO);
        list.add(fireCrackerDTO1);
        list.add(fireCrackerDTO2);
        list.add(fireCrackerDTO3);
        list.add(fireCrackerDTO4);

        Collections.sort(list);
        for (FireCrackerDTO val:list
        ) {
            System.out.println(val);
        }

    }
}
