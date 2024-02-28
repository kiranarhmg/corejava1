package com.collection.example.map.runner;

import com.collection.example.map.dto.AddressDTO;
import com.collection.example.map.dto.PersonDTO;

import java.util.HashMap;
import java.util.Map;

public class PersonRunner {
    public static void main(String[] args) {
        PersonDTO person1=new PersonDTO("kiran",23,"kiran@gmail.com");
        PersonDTO person2 = new PersonDTO("John", 30, "john@example.com");
        PersonDTO person3 = new PersonDTO("Alice", 25, "alice@example.com");
        PersonDTO person4 = new PersonDTO("Bob", 28, "bob@example.com");
        PersonDTO person5 = new PersonDTO("Emily", 22, "emily@example.com");
        PersonDTO person6 = new PersonDTO("Michael", 35, "michael@example.com");
        PersonDTO person7 = new PersonDTO("Sophia", 29, "sophia@example.com");
        PersonDTO person8 = new PersonDTO("David", 27, "david@example.com");
        PersonDTO person9 = new PersonDTO("Emma", 24, "emma@example.com");
        PersonDTO person10=new PersonDTO("pavan",20,"pavan@gmail.com");


        AddressDTO addressDTO1 = new AddressDTO("BTM Layout", 560076, "Bangalore");
        AddressDTO addressDTO2 = new AddressDTO("Koramangala", 560034, "Bangalore");
        AddressDTO addressDTO3 = new AddressDTO("Indiranagar", 560038, "Bangalore");
        AddressDTO addressDTO4 = new AddressDTO("Whitefield", 560066, "Bangalore");
        AddressDTO addressDTO5 = new AddressDTO("Jayanagar", 560041, "Bangalore");
        AddressDTO addressDTO6 = new AddressDTO("Malleshwaram", 560003, "Bangalore");
        AddressDTO addressDTO7 = new AddressDTO("Electronic City", 560100, "Bangalore");
        AddressDTO addressDTO8 = new AddressDTO("Marathahalli", 560037, "Bangalore");
        AddressDTO addressDTO9 = new AddressDTO("Hebbal", 560024, "Bangalore");
        AddressDTO addressDTO10 = new AddressDTO("Bannerghatta Road", 560076, "Bangalore");

        Map<PersonDTO,AddressDTO> map=new HashMap<>();
        map.put(person1,addressDTO1);
        map.put(person2,addressDTO2);
        map.put(person3,addressDTO3);
        map.put(person4,addressDTO3);
        map.put(person5,addressDTO5);
        map.put(person6,addressDTO6);
        map.put(person7,addressDTO7);
        map.put(person8,addressDTO8);
        map.put(person9,addressDTO9);
        map.put(person10,addressDTO10);

        PersonDTO person11=new PersonDTO("kiran",23,"kiran@gmail.com");

        map.put(person11,addressDTO10);
        map.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println(map.containsKey(person11));

    }
}
