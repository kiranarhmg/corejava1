package com.xworkz.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JoyStickDtoRunner {
    public static void main(String[] args) {
        JoyStickDTO joyStickDTO=new JoyStickDTO("turbo",2000,20);
        JoyStickDTO joyStickDTO1=new JoyStickDTO("sky master",3000,10);
        JoyStickDTO joyStickDTO2=new JoyStickDTO("steller",2500,30);
        JoyStickDTO joyStickDTO3=new JoyStickDTO("velocity",2200,25);
        JoyStickDTO joyStickDTO4=new JoyStickDTO("hyper speed",1000,50);

        List<JoyStickDTO> list=new ArrayList<>();

        list.add(joyStickDTO);
        list.add(joyStickDTO1);
        list.add(joyStickDTO2);
        list.add(joyStickDTO3);
        list.add(joyStickDTO4);

        Collections.sort(list);
        for (JoyStickDTO val:list
        ) {
            System.out.println(val);
        }



    }
}
