package com.xworkz.collection.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LiftDtoRunner {
    public static void main(String[] args) {
        LiftDTO liftDTO=new LiftDTO(5,10,50,3);
        LiftDTO liftDTO1=new LiftDTO(6,15,60,4);
        LiftDTO liftDTO2=new LiftDTO(7,20,70,5);
        LiftDTO liftDTO3=new LiftDTO(4,8,40,2);

        List<LiftDTO> list=new ArrayList<>();
        list.add(liftDTO);
        list.add(liftDTO1);
        list.add(liftDTO2);
        list.add(liftDTO3);

        Collections.sort(list,(l1, l2)->(Double.compare(l1.getCapacity(), l2.getCapacity())));
        System.out.println("capacity in asc");
        for (LiftDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");

        Collections.sort(list,(l1, l2)->(Double.compare(l2.getCapacity(), l1.getCapacity())));
        System.out.println("capacity in dsc");
        for (LiftDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");

        Collections.sort(list,(l1, l2)->(Double.compare(l1.getMaxFloors(), l2.getMaxFloors())));
        System.out.println("max floors in asc");
        for (LiftDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");

        Collections.sort(list,(l1, l2)->(Double.compare(l2.getMaxFloors(), l1.getMaxFloors())));
        System.out.println("max floors in dsc");
        for (LiftDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");

        Collections.sort(list,(l1, l2)->(Double.compare(l1.getWidth(), l2.getWidth())));
        System.out.println("width in asc");
        for (LiftDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");

        Collections.sort(list,(l1, l2)->(Double.compare(l2.getWidth(), l1.getWidth())));
        System.out.println("width in dsc");
        for (LiftDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(Double.compare(l1.getHeight(), l2.getHeight())));
        System.out.println("height in asc");
        for (LiftDTO val:list
        ) {
            System.out.println(val);
        }
        System.out.println("************************************");
        Collections.sort(list,(l1, l2)->(Double.compare(l2.getHeight(), l1.getHeight())));
        System.out.println("height in dsc");
        for (LiftDTO val:list
        ) {
            System.out.println(val);
        }

    }
}
