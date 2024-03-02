package com.collection.example.map.runner;

import com.collection.example.map.dto.CompanyDTO;
import com.collection.example.map.dto.LocationDTO;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CompanyDTORunner {
    public static void main(String[] args) {
        CompanyDTO companyDTO=new CompanyDTO("amazon","jeff bejos");
        CompanyDTO companyDTO1=new CompanyDTO("microsoft","Bill gates");
        CompanyDTO companyDTO2=new CompanyDTO("tesla","elon musk");
        CompanyDTO companyDTO3=new CompanyDTO("Tata Group","Jamsetji Tata ");

        LocationDTO locationDTO=new LocationDTO("bengalore",572178);
        LocationDTO locationDTO1=new LocationDTO("mysore",373729);
        LocationDTO locationDTO2=new LocationDTO("america",48389);
        LocationDTO locationDTO3=new LocationDTO("india",373879);

        Map<CompanyDTO,LocationDTO> map=new HashMap<>();
        map.put(companyDTO,locationDTO);
        map.put(companyDTO1,locationDTO1);
        map.put(companyDTO2,locationDTO2);
        map.put(companyDTO3,locationDTO3);

        Set<CompanyDTO> set=map.keySet();
        set.forEach(ref-> System.out.println(ref));

        Collection<LocationDTO> collection=map.values();
       collection.forEach(rer-> System.out.println(rer));

        System.out.println( map.containsKey(companyDTO));
        System.out.println(map.containsValue(locationDTO));

        System.out.println(map.get(companyDTO2));
       Set<Map.Entry<CompanyDTO,LocationDTO>> set1=map.entrySet();
       set1.forEach(ref-> System.out.println(ref.getKey()+" : "+ref.getValue()));

        System.out.println(map.remove(companyDTO3));
        System.out.println(map.isEmpty());
        System.out.println(map.size());

        System.out.println(map.get(companyDTO1));








    }
}
