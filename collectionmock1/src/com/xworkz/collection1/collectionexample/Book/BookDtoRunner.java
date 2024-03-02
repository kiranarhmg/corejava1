package com.xworkz.collection1.collectionexample.Book;

import javax.swing.text.html.HTMLDocument;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookDtoRunner {
    public static void main(String[] args) {
        BookDTO bookDTO=new BookDTO(LocalDate.of(2023,11,24),"abc",9,100);
        BookDTO bookDTO1=new BookDTO(LocalDate.of(2024,1,20),"xyz",8,200);
        BookDTO bookDTO2=new BookDTO(LocalDate.of(2021,1,20),"stv",10,300);

        List<BookDTO> list=new ArrayList<>();
        list.add(bookDTO);
        list.add(bookDTO1);
        list.add(bookDTO2);
        System.out.println("books written after 2022 : ");

        list.stream().filter(ref->ref.getDate().isAfter(LocalDate.of(2022,10,11))).forEach(ref-> System.out.println(ref));
        System.out.println("taotal count of books:");
        long l=list.stream().map(ref->ref.getAuthor()).count();
        System.out.println(l);

       list.stream().filter(ref->ref.getRating()> ref.getRating()).forEach(ref-> System.out.println(ref));
        System.out.println("highest rating");
        System.out.println(list.stream().max((p1,p2)-> Double.compare(p1.getRating(), p2.getRating())));

       int total=0;
        Iterator<BookDTO> iterator= list.iterator();
        while (iterator.hasNext())
        {
            total=iterator.next().getPrice();
           total+=total;
        }
        System.out.println("total price of all books : "+total);

    }
}
