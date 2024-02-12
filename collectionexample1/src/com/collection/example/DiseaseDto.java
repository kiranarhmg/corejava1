package com.collection.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@ToString
@Setter
@Getter
@AllArgsConstructor
public class DiseaseDto implements Serializable,Comparable<DiseaseDto> {
    private String diseaseName;
    private String treatment;
    private String symptoms;
    private String prevention;

    @Override
    public int compareTo(DiseaseDto o) {
        return this.treatment.compareTo(o.getTreatment());
    }
}
