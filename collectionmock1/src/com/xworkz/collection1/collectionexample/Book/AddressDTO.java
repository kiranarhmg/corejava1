package com.xworkz.collection1.collectionexample.Book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class AddressDTO {
    String city;
    int pinCode;

    @Override
    public boolean equals(Object obj) {
       if(obj!=null && obj instanceof AddressDTO)
       {
           AddressDTO adt=(AddressDTO) obj;
           if(this.city.equals(adt.getCity()) && this.pinCode==adt.getPinCode())
           {
               return true;
           }
       }
       return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCity(),getPinCode());
    }
}
