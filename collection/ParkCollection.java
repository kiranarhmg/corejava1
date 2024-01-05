package com.xworkz.profile.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ParkCollection {
    public static void main(String[] args) {
        Collection<String> park=new ArrayList<>();
        park.add("netravati park");
        park.add("Lumbini Park");
        park.add("Raj Ghat");
        park.add("City Park");
        park.add("Zakir Hussain Rose Garden");
        park.add("Indira Park");
        park.add("Shalimar Bagh");
        park.add("Eco Park");
        park.add("Children's Park");
        park.add("Sarojini Naidu Vanita Park");
        park.add("Safdarjung Enclave Park");
        park.add("Mysuru Zoo");
        park.add("Victoria Memorial Garden");
        park.add("Gandhi Park");
        park.add("Rani Baug");
        park.add("Kanha Fun City");
        park.add("Sisodia Rani Garden");
        park.add("Shankar's International Dolls Museum Garden");
        park.add("Sanjay Gandhi National Park");
        park.add("Deer Park");
        park.add("Sunder Nursery");
        park.add("Saras Baug");
        park.add("Marina Beach Park");
        park.add("Valluvar Kottam");
        park.add("Semmozhi Poonga");
        park.add("Nehru Zoological Park");
        park.add("NTR Gardens");
        park.add("KBR National Park");
        park.add("Ramoji Film City Park");
        park.add("Sanjeevaiah Park");
        park.add("Jal Vihar");
        park.add("Nehru Park");
        park.add("Shivaji Park");
        park.add("Peshwa Udyan");
        park.add("Kamala Nehru Park");
        park.add("Japanese Park");
        park.add("Sundarbans National Park");
        park.add("Chapramari Wildlife Sanctuary");
        park.add("Ranthambhore National Park");
        park.add("Jim Corbett National Park");
        park.add("Gir Forest National Park");
        park.add("Periyar National Park");
        park.add("Bandipur National Park");
        park.add("Hemis National Park");
        park.add("Bannerghatta Biological Park");
        park.add("Golgumbaz Garden");
        park.add("Rock Garden");
        park.add("Shanti Van");
        park.add("Kankaria Lakefront Park");
        park.add("Sayaji Baug");
        park.add("Osho Teerth Park");
        park.add("Nehru Bal Udyan");
        park.add("Jawahar Circle Garden");
        park.add("Swarna Jayanti Park");
        park.add("Dal Lake Garden");
        park.add("Shalimar Bagh");
        park.add("Nishat Bagh");
        park.add("Chashme Shahi Garden");
        park.add("Tulip Garden");

        Iterator<String> parkIterate=park.iterator();

        while (parkIterate.hasNext())
        {
            String str=parkIterate.next();
            if(str.startsWith("B"))
            {
                System.out.println("park name starts with 'B' :  "+str);
            } else if (str.endsWith("k")) {
                System.out.println("park name ends with 'k' :  "+str);

            }
        }

    }
}
