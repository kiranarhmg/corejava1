package com.collection.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiseaseDtoRunner {
    public static void main(String[] args) {
        DiseaseDto diseaseDto=new DiseaseDto("covid","antiviral medication","cold","social distance");
        DiseaseDto diseaseDto1=new DiseaseDto("fever","antiviral medication","increase temp","vaccin");
        DiseaseDto diseaseDto2=new DiseaseDto("diabetes","insulin","weight loss","diet");
        DiseaseDto diseaseDto3=new DiseaseDto("maleria","antibiotic","chills","hygin");

        List<DiseaseDto> list=new ArrayList<>();
        list.add(diseaseDto);
        list.add(diseaseDto1);
        list.add(diseaseDto2);
        list.add(diseaseDto3);
        System.out.println("name in asc");
        Collections.sort(list,(p1,p2)->p1.getDiseaseName().compareTo(p2.getDiseaseName()));
        list.forEach(ref1-> System.out.println(ref1));

        System.out.println("name in dsc");
        Collections.sort(list,(p1,p2)->p2.getDiseaseName().compareTo(p1.getDiseaseName()));
        list.forEach(ref1-> System.out.println(ref1));

        System.out.println("treatment in asc");
        Collections.sort(list,(p1,p2)->p1.getTreatment().compareTo(p2.getTreatment()));
        list.forEach(ref1-> System.out.println(ref1));

        System.out.println("treatment in dsc");
        Collections.sort(list,(p1,p2)->p2.getTreatment().compareTo(p1.getTreatment()));
        list.forEach(ref1-> System.out.println(ref1));

        System.out.println("symptoms in asc");
        Collections.sort(list,(p1,p2)->p1.getSymptoms().compareTo(p2.getSymptoms()));
        list.forEach(ref1-> System.out.println(ref1));

        System.out.println("symptoms in dsc");
        Collections.sort(list,(p1,p2)->p2.getSymptoms().compareTo(p1.getSymptoms()));
        list.forEach(ref1-> System.out.println(ref1));

        System.out.println("prevention in asc");
        Collections.sort(list,(p1,p2)->p1.getPrevention().compareTo(p2.getPrevention()));
        list.forEach(ref1-> System.out.println(ref1));

        System.out.println("prevention in dsc");
        Collections.sort(list,(p1,p2)->p2.getPrevention().compareTo(p1.getPrevention()));
        list.forEach(ref1-> System.out.println(ref1));

    }
}
