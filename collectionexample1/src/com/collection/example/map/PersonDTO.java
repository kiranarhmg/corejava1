package com.collection.example.map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class PersonDTO implements Serializable {
    private String name;
    private String email;

    @Override
    public boolean equals(Object obj) {
        if(obj !=null)
        {
            if(obj instanceof PersonDTO)
            {
                PersonDTO personDTO=(PersonDTO) obj;
                if(this.email.equals(personDTO.getEmail()))
                {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmail());
    }
}
