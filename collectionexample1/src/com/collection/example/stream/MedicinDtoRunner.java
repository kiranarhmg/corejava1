package com.collection.example.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MedicinDtoRunner {
    public static void main(String[] args) {
String[] in={"paracetomol","citrizine","phenylphrine"};
MedicinDTO medicinDTO=new MedicinDTO("Coldfiz",1,"micro lab", LocalDate.of(2025,4,22),LocalDate.of(2023,12,28),5,in);


        // Second Medicine
        String[] in2 = {"ibuprofen", "diphenhydramine"};
        MedicinDTO medicine2 = new MedicinDTO("Advil PM", 2, "Pfizer", LocalDate.of(2023, 8, 15), LocalDate.of(2022,12,9), 8, in2);

        // Third Medicine
        String[] in3 = {"dextromethorphan", "guaifenesin", "phenylephrine"};
        MedicinDTO medicine3 = new MedicinDTO("Mucinex", 3, "Reckitt Benckiser", LocalDate.of(2024, 6, 30), LocalDate.of(2023,11,25), 7, in3);

        // Fourth Medicine
        String[] in4 = {"chlorpheniramine", "pseudoephedrine"};
        MedicinDTO medicine4 = new MedicinDTO("Sudafed", 4, "Johnson & Johnson", LocalDate.of(2023, 10, 10), LocalDate.of(2022,7,10), 9, in4);

        // Fifth Medicine
        String[] in5 = {"loratadine"};
        MedicinDTO medicine5 = new MedicinDTO("Claritin", 5, "Bayer", LocalDate.of(2023, 12, 25), LocalDate.of(2021,05,20), 6, in5);

        String[] in6 = {"aspirin", "caffeine"};
        MedicinDTO medicine6 = new MedicinDTO("Anacin", 3, "Bayer", LocalDate.of(2023, 9, 10), LocalDate.of(2022, 11, 25), 6, in2);

// Object 3
        String[] in7 = {"loratadine", "pseudoephedrine"};
        MedicinDTO medicine7 = new MedicinDTO("Claritin-D", 4, "Bayer", LocalDate.of(2023, 11, 30), LocalDate.of(2022, 10, 5), 12, in3);

// Object 4
        String[] in8 = {"fexofenadine", "montelukast"};
        MedicinDTO medicine8 = new MedicinDTO("Singulair", 5, "Merck", LocalDate.of(2024, 3, 15), LocalDate.of(2022, 9, 17), 9, in4);

// Object 5
        String[] in9 = {"omeprazole"};
        MedicinDTO medicine9 = new MedicinDTO("Prilosec", 6, "AstraZeneca", LocalDate.of(2023, 7, 25), LocalDate.of(2022, 8, 30), 15, in5);

// Object 6
        String[] in10 = {"ranitidine"};
        MedicinDTO medicine10 = new MedicinDTO("Zantac", 7, "GlaxoSmithKline", LocalDate.of(2023, 6, 10), LocalDate.of(2022, 7, 15), 7, in6);

// Object 7
        String[] in11 = {"atorvastatin"};
        MedicinDTO medicine11 = new MedicinDTO("Lipitor", 8, "Pfizer", LocalDate.of(2024, 1, 5), LocalDate.of(2023, 5, 20), 11, in7);

// Object 8
        String[] in12 = {"simvastatin"};
        MedicinDTO medicine13 = new MedicinDTO("Zocor", 9, "Merck", LocalDate.of(2023, 10, 30), LocalDate.of(2022, 12, 15), 13, in8);

// Object 9
        String[] in14= {"metformin"};
        MedicinDTO medicine15 = new MedicinDTO("Glucophage", 10, "Bristol Myers Squibb", LocalDate.of(2024, 2, 20), LocalDate.of(2023, 4, 10), 14, in9);

// Object 10
        String[] in16 = {"levothyroxine"};
        MedicinDTO medicine16 = new MedicinDTO("Synthroid", 11, "AbbVie", LocalDate.of(2023, 8, 5), LocalDate.of(2022, 11, 30), 16, in10);
        List<MedicinDTO> list=new ArrayList<>();
        list.add(medicinDTO);

        list.add(medicine2);
        list.add(medicine3);
        list.add(medicine4);
        list.add(medicine5);
        list.add(medicine6);
        list.add(medicine7);
        list.add(medicine8);
        list.add(medicine9);
        list.add(medicine10);
        list.add(medicine11);
        list.add(medicine13);
        list.add(medicine15);
        list.add(medicine16);

        System.out.println("sorting based on company name");
            Collections.sort(list);
            list.forEach(ref-> System.out.println(ref));

        System.out.println("***********collecting list where ingredients greater than 2");
        List<MedicinDTO> list1=  list.stream().filter(ref->ref.getIngredients().length>2).collect(Collectors.toList());
        list1.forEach(ref-> System.out.println(ref));
        System.out.println("**********sort all by cost asc");
        list.stream().sorted((p1,p2)->Double.compare(p1.getCost(), p2.getCost())).forEach(ref-> System.out.println(ref));



        for (MedicinDTO medicine : list) {
            String[] ingredients = medicine.getIngredients();
            for (String ingredient : ingredients) {
                System.out.println(ingredient);
            }
        }
        System.out.println("**************collect only company sort by desc and print in uppercase**************");
        System.out.println( list.stream().sorted((p1,p2)->p2.getCompany().compareTo(p1.getCompany())).map(ref->ref.getCompany().toUpperCase()).collect(Collectors.toList()));

        System.out.println("**************collect only name sort by desc and print in lowercase**************");
        System.out.println( list.stream().sorted((p1,p2)->p2.getName().compareTo(p1.getName())).map(ref->ref.getName().toLowerCase()).collect(Collectors.toList()));

        System.out.println("sort expiry date by desc");
        list.stream().map(ref->ref.getExpiryDate()).sorted(Collections.reverseOrder()).forEach(ref-> System.out.println(ref));

        System.out.println("collect all elements manufacture date less than 30");
       List<MedicinDTO> list2=  list.stream().filter(ref->ref.getManfDate().getDayOfMonth()<30).collect(Collectors.toList());
       list2.forEach(ref-> System.out.println(ref));

        System.out.println("collect all elements manufacture date greater than 30");
        List<MedicinDTO> list3=  list.stream().filter(ref->ref.getManfDate().getDayOfMonth()>30).collect(Collectors.toList());
        list3.forEach(ref-> System.out.println(ref));

        System.out.println("collect all elements expiry date less than 30");
        List<MedicinDTO> list4=  list.stream().filter(ref->ref.getExpiryDate().getDayOfMonth()<30).collect(Collectors.toList());
        list4.forEach(ref-> System.out.println(ref));
    }
}
