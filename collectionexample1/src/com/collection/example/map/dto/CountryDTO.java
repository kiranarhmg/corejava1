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
public class CountryDTO {
    private String name;
    private double area;
    private String pm;

    @Override
    public boolean equals(Object obj) {
        if(obj!=null && obj instanceof CountryDTO)
        {
            CountryDTO countryDTO=(CountryDTO) obj;
            if (this.name.equals(countryDTO.getName()))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
