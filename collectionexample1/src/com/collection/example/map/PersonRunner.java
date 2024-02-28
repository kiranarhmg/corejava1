package com.collection.example.map;

import java.util.HashMap;
import java.util.Map;

public class PersonRunner {
    public static void main(String[] args) {
        PersonDTO personDTO=new PersonDTO("kiran","kiran@gmail.com");
        PersonDTO personDTO1=new PersonDTO("anil","anil@gmail.com");
        PersonDTO personDTO2=new PersonDTO("hitesh","hitesh@gmail.com");
        PersonDTO personDTO3=new PersonDTO("kiran","kumar@gmail.com");
        PersonDTO personDTO4=new PersonDTO("kiran","manoj@gmail.com");

AddressDTO addressDTO=new AddressDTO("btm",938383);
        AddressDTO addressDTO1=new AddressDTO("vijayanagar",938383);
        AddressDTO addressDTO2=new AddressDTO("rr",938383);
        AddressDTO addressDTO3=new AddressDTO("jayanagar",938383);
        AddressDTO addressDTO4=new AddressDTO("majestic",938383);

        Map<PersonDTO,AddressDTO> map=new HashMap<>();

    }
}
