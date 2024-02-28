package com.collection.example.map.runner;

import com.collection.example.map.dto.CapitalDTO;
import com.collection.example.map.dto.CountryDTO;

import java.util.HashMap;
import java.util.Map;

public class CountryRunner {
    public static void main(String[] args) {
        CountryDTO countryDTO1=new CountryDTO("india",3.287,"modi");
        CountryDTO countryDTO2 = new CountryDTO("United States", 9.834, "Joe Biden");
        CountryDTO countryDTO3 = new CountryDTO("China", 9.597, "Xi Jinping");
        CountryDTO countryDTO4 = new CountryDTO("Brazil", 8.516, "Jair Bolsonaro");
        CountryDTO countryDTO5 = new CountryDTO("Australia", 7.692, "Scott Morrison");
        CountryDTO countryDTO6 = new CountryDTO("Russia", 17.1, "Vladimir Putin");
        CountryDTO countryDTO7 = new CountryDTO("Canada", 9.984, "Justin Trudeau");
        CountryDTO countryDTO8 = new CountryDTO("Argentina", 2.78, "Alberto Fernández");
        CountryDTO countryDTO9 = new CountryDTO("Kazakhstan", 2.724, "Kassym-Jomart Tokayev");
        CountryDTO countryDTO10 = new CountryDTO("Algeria", 2.38, "Abdelmadjid Tebboune");

        CapitalDTO capitalDTO1 = new CapitalDTO("New Delhi", 28.6139, 77.2090); // India
        CapitalDTO capitalDTO2 = new CapitalDTO("Washington, D.C.", 38.9072, -77.0369); // United States
        CapitalDTO capitalDTO3 = new CapitalDTO("London", 51.5074, -0.1278); // United Kingdom
        CapitalDTO capitalDTO4 = new CapitalDTO("Paris", 48.8566, 2.3522); // France
        CapitalDTO capitalDTO5 = new CapitalDTO("Beijing", 39.9042, 116.4074); // China
        CapitalDTO capitalDTO6 = new CapitalDTO("Moscow", 55.7558, 37.6173); // Russia
        CapitalDTO capitalDTO7 = new CapitalDTO("Tokyo", 35.6895, 139.6917); // Japan
        CapitalDTO capitalDTO8 = new CapitalDTO("Brasília", -15.8267, -47.9218); // Brazil
        CapitalDTO capitalDTO9 = new CapitalDTO("Cairo", 30.0444, 31.2357); // Egypt
        CapitalDTO capitalDTO10 = new CapitalDTO("Rome", 41.9028, 12.4964); // Italy

        Map<CountryDTO,CapitalDTO> map=new HashMap<>();

        map.put(countryDTO1,capitalDTO2);
        map.put(countryDTO2,capitalDTO2);
        map.put(countryDTO3,capitalDTO3);
        map.put(countryDTO4,capitalDTO4);
        map.put(countryDTO5,capitalDTO5);
        map.put(countryDTO6,capitalDTO6);
        map.put(countryDTO7,capitalDTO7);
        map.put(countryDTO8,capitalDTO8);
        map.put(countryDTO9,capitalDTO9);
        map.put(countryDTO10,capitalDTO10);

        CountryDTO countryDTO11=new CountryDTO("india",3.287,"narendra modi");
        map.put(countryDTO11,capitalDTO1);
        map.forEach((k,v)-> System.out.println(k+" "+v));


    }
}
