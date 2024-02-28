package com.collection.example.map.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class PersonDTO {
    private String name;
    private int age;
    private String email;

    @Override
    public boolean equals(Object obj) {
        if(obj!=null && obj instanceof PersonDTO)
        {
            PersonDTO personDTO=(PersonDTO) obj;
            if(this.email.equals(((PersonDTO) obj).getEmail()))
                return true;
        }
          return false;
    }

    @Override
    public int hashCode() {
        System.out.println("times");
        return Objects.hash(getEmail());
    }
}
