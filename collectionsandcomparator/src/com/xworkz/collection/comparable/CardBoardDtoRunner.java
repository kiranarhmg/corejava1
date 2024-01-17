package com.xworkz.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardBoardDtoRunner {
    public static void main(String[] args) {
        CardBoardDTO cardBoardDTO=new CardBoardDTO(100,"white",80);
        CardBoardDTO cardBoardDTO1=new CardBoardDTO(120,"brown",70);
        CardBoardDTO cardBoardDTO2=new CardBoardDTO(90,"green",60);
        CardBoardDTO cardBoardDTO3=new CardBoardDTO(80,"blue",85);
        CardBoardDTO cardBoardDTO4=new CardBoardDTO(140,"red",100);

        List<CardBoardDTO> list=new ArrayList<>();
        list.add(cardBoardDTO);
        list.add(cardBoardDTO1);
        list.add(cardBoardDTO2);
        list.add(cardBoardDTO3);
        list.add(cardBoardDTO4);

        Collections.sort(list);
        // sorted on size property
        for (CardBoardDTO val:list
        ) {
            System.out.println(val);
        }


    }
}
