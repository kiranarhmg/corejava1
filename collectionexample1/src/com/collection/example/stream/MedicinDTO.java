package com.collection.example.stream;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
@AllArgsConstructor
@Setter
@Getter
@ToString
public class MedicinDTO implements Serializable,Comparable<MedicinDTO> {
    private String name;
    private int id;
    private String company;
    private LocalDate expiryDate;
    private LocalDate manfDate;
    private int cost;
    private String[] ingredients;

    @Override
    public int compareTo(MedicinDTO o) {
        return this.company.compareTo(o.getCompany());
    }
}
