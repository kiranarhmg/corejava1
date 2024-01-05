package com.xworkz.profile.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AirportCollection {
    public static void main(String[] args) {
        Collection<String> airport=new ArrayList<>();
        airport.add("Indira Gandhi International Airport");
        airport.add("Chhatrapati Shivaji Maharaj International Airport");
        airport.add("Kempegowda International Airport");
        airport.add("Rajiv Gandhi International Airport");
        airport.add("Netaji Subhas Chandra Bose International Airport");
        airport.add("Chennai International Airport");
        airport.add("Sardar Vallabhbhai Patel International Airport");
        airport.add("Raja Bhoj Airport");
        airport.add("Goa International Airport");
        airport.add("Cochin International Airport");
        airport.add("Dabolim Airport");
        airport.add("Ahmedabad Airport");
        airport.add("Pune Airport");
        airport.add("Jaipur International Airport");
        airport.add("Bengaluru City Airport");
        airport.add("Hyderabad Airport");
        airport.add("Kolkata Airport");
        airport.add("Mumbai Airport");
        airport.add("Delhi Airport");
        airport.add("Chandigarh International Airport");
        airport.add("Lucknow Airport");
        airport.add("Guwahati International Airport");
        airport.add("Thiruvananthapuram International Airport");
        airport.add("Biju Patnaik International Airport");
        airport.add("Veer Savarkar International Airport");
        airport.add("Dr. Babasaheb Ambedkar International Airport");
        airport.add("Coimbatore International Airport");
        airport.add("Sri Guru Ram Dass Jee International Airport");
        airport.add("Raja Sansi International Airport");
        airport.add("Visakhapatnam International Airport");
        airport.add("Tiruchirapalli International Airport");
        airport.add("Madurai International Airport");
        airport.add("Rajahmundry Airport");
        airport.add("Jodhpur Airport");
        airport.add("Dehradun Airport");
        airport.add("Bhuj Airport");
        airport.add("Birsa Munda Airport");
        airport.add("Bagdogra International Airport");
        airport.add("Trivandrum International Airport");
        airport.add("Vadodara International Airport");
        airport.add("Srinagar International Airport");
        airport.add("Sheikh ul-Alam International Airport");
        airport.add("Shimla Airport");
        airport.add("Silchar Airport");
        airport.add("Shirdi Airport");
        airport.add("Shillong Airport");
        airport.add("Shirdi Airport");
        airport.add("Ratnagiri Airport");
        airport.add("Ranchi Airport");
        airport.add("Rajkot International Airport");
        airport.add("Raipur Airport");
        airport.add("Porbandar Airport");
        airport.add("Pantnagar Airport");
        airport.add("Pakyong Airport");
        airport.add("Pathankot Airport");
        airport.add("Patiala Airport");
        airport.add("Nal Airport");
        airport.add("Mysuru Airport");
        airport.add("Mangalore International Airport");
        airport.add("Lokpriya Gopinath Bordoloi International Airport");
        airport.add("Lengpui Airport");
        airport.add("Kushok Bakula Rimpochee Airport");
        airport.add("Kochi Airport");
        airport.add("Kandla Airport");
        airport.add("Kanpur Airport");
        airport.add("Kangra Airport");
        airport.add("Jammu Airport");
        airport.add("Jamnagar Airport");
        airport.add("Jaisalmer Airport");
        airport.add("Jalgaon Airport");
        airport.add("Jabalpur Airport");
        airport.add("Imphal International Airport");
        airport.add("Haldwani Airport");
        airport.add("Gwalior Airport");
        airport.add("Gorakhpur Airport");
        airport.add("Gondia Airport");
        airport.add("Gaggal Airport");
        airport.add("Dibrugarh Airport");
        airport.add("Dharamshala Airport");
        airport.add("Dharamsala-Kangra Airport");
        airport.add("Darbhanga International Airport");
        airport.add("Deoghar Airport");
        airport.add("Daman Airport");
        airport.add("Dibrugarh Airport");
        airport.add("Dharamshala Airport");
        Iterator<String> airportIteratore= airport.iterator();
        while (airportIteratore.hasNext())
        {
            String str=airportIteratore.next();
            String str1="";
            for (int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(ch>=97 && ch<=122)
                {
                    ch=(char) (ch-32);
                }
                str1+=ch;
            }
            System.out.println(str1);
        }
    }
}
