package com.collection.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ShoeBrands {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("nika");
        list.add("puma");
        list.add("adidas");
        list.add("reebok");
        list.add("sparx");
        list.add("walkaroo");
        list.add("fila");
        list.add("bata");
        list.add("mochi");
        list.add("liberty");

        ListIterator<String> iterator= list.listIterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("list in reverse order");
        ListIterator<String> iterator1= list.listIterator(list.size());
        while (iterator1.hasPrevious())
        {
            System.out.println(iterator1.previous());
        }


        System.out.println("list from given index");
        ListIterator<String> iterator2= list.listIterator(3);

        while (iterator2.hasNext())
        {
            System.out.println(iterator2.next());
        }

        System.out.println("list from given index in reverse order");
        ListIterator<String> iterator3= list.listIterator(3);

        while (iterator3.hasPrevious())
        {
            System.out.println(iterator3.previous());
        }

        System.out.println("main list is");
        list.forEach(ref1-> System.out.println(ref1));

        ListIterator<String> iterator4= list.listIterator();

        while (iterator4.hasNext())
        {
            System.out.println(iterator4.next());
                if("liberty".equals(iterator4.next()))
                    iterator4.add("campus");
        }
        System.out.println("after adding");

list.forEach(ref1-> System.out.println(ref1));

         ListIterator<String> iterator5= list.listIterator();
         while (iterator5.hasNext())
         {
             if("nika".equals(iterator5.next()))
             {
                 iterator5.remove();
             }
         }
        System.out.println("after remove");

        list.forEach(ref1-> System.out.println(ref1));

        System.out.println("printing in reverse order");
        Collections.sort(list,Collections.reverseOrder());
        list.forEach(ref1-> System.out.println(ref1));

    }
}
