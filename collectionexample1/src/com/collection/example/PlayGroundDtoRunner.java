package com.collection.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayGroundDtoRunner {
    public static void main(String[] args) {


    PlayGroundDto playGroundDto=new PlayGroundDto("sanket",2,100,"dvg");
    PlayGroundDto playGroundDto1=new PlayGroundDto("vivekananda",1,50,"bangalore");
    PlayGroundDto playGroundDto2=new PlayGroundDto("bapuji",1,80,"dvg");
    PlayGroundDto playGroundDto3=new PlayGroundDto("rayanna",0.5,40,"btm");

  List<PlayGroundDto> list=new ArrayList<>();
  list.add(playGroundDto);
  list.add(playGroundDto1);
  list.add(playGroundDto2);
  list.add(playGroundDto3);
        System.out.println("name in asc");
  Collections.sort(list,(p1,p2)->p1.getGroundName().compareTo(p2.getGroundName()));
  list.forEach(ref1-> System.out.println(ref1));

        System.out.println("name in dsc");
        Collections.sort(list,(p1,p2)->p2.getGroundName().compareTo(p1.getGroundName()));
        list.forEach(ref1-> System.out.println(ref1));

        System.out.println("area in asc");
        Collections.sort(list,(p1,p2)->Double.compare(p1.getArea(), p2.getArea()));
        list.forEach(ref1-> System.out.println(ref1));

        System.out.println("area in dsc");
        Collections.sort(list,(p1,p2)->Double.compare(p2.getArea(), p1.getArea()));
        list.forEach(ref1-> System.out.println(ref1));

        System.out.println("width in asc");
        Collections.sort(list,(p1,p2)->Double.compare(p1.getWidth(), p2.getWidth()));
        list.forEach(ref1-> System.out.println(ref1));

        System.out.println("width in dsc");
        Collections.sort(list,(p1,p2)->Double.compare(p2.getWidth(), p1.getWidth()));
        list.forEach(ref1-> System.out.println(ref1));

        System.out.println("location in dsc");
        Collections.sort(list,(p1,p2)->p2.getLocation().compareTo(p1.getLocation()));
        list.forEach(ref1-> System.out.println(ref1));

        System.out.println("location in asc");
        Collections.sort(list,(p1,p2)->p1.getLocation().compareTo(p2.getLocation()));
        list.forEach(ref1-> System.out.println(ref1));






    }

}
