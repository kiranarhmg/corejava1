package com.xworkz.profile.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HospitalCollection {
    public static void main(String[] args) {
        Collection<String> name=new ArrayList<>();

          name.add("ApollO");
        name.add("Fortis Healthcare");
        name.add("AIIMS (All India Institute of Medical Sciences)");
        name.add("Max Healthcare");
        name.add("Medanta - The Medicity");
        name.add("Narayana Health");
        name.add("Columbia Asia Hospitals");
        name.add("Tata Memorial Hospital");
        name.add("Artemis Hospitals");
        name.add("Manipal Hospitals");
        name.add("Kokilaben Dhirubhai Ambani Hospital");
        name.add("Sir Ganga Ram Hospital");
        name.add("Lilavati Hospital and Research Centre");
        name.add("Wockhardt Hospitals");
        name.add("Sri Sathya Sai Institute of Higher Medical Sciences");
        name.add("Ruby Hall Clinic");
        name.add("KIMS (Krishna Institute of Medical Sciences)");
        name.add("Amrita Institute of Medical Sciences");
        name.add("Aster Medcity");
        name.add("Christian Medical College, Vellore");

        Iterator<String> nameIterat=name.iterator();

        while (nameIterat.hasNext())
        {
            String str=nameIterat.next();
            if(str.endsWith("o")||str.endsWith("O"))
            {
                System.out.println("hospital name that ends with 'o' :"+str);
            }
        }
    }
}
