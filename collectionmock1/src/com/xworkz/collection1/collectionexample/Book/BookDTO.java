package com.xworkz.collection1.collectionexample.Book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BookDTO {
    private LocalDate date;
    private String author;
    private  int rating;
    private int price;

}
