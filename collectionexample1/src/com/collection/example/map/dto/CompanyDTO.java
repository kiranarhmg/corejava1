package com.collection.example.map.dto;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Collections;
import java.util.Objects;

@AllArgsConstructor
@ToString
@Getter
@Setter

public class CompanyDTO implements Serializable {
    private String name;
    private String owner;

    @Override
    public boolean equals(Object obj) {
        if(obj!=null && obj instanceof CompanyDTO)
        {
            CompanyDTO companyDTO=(CompanyDTO) obj;
            if(this.name.equals(companyDTO.getName()))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
