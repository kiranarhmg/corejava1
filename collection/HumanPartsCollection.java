package com.xworkz.profile.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HumanPartsCollection {
    public static void main(String[] args) {
        Collection<String> humanParts=new ArrayList<>();
        humanParts.add("eyes");
        humanParts.add("head");
        humanParts.add("neck");
        humanParts.add("shoulders");
        humanParts.add("arms");
        humanParts.add("elbows");
        humanParts.add("wrists");
        humanParts.add("hands");
        humanParts.add("fingers");
        humanParts.add("chest");
        humanParts.add("back");
        humanParts.add("waist");
        humanParts.add("hips");
        humanParts.add("legs");
        humanParts.add("knees");
        humanParts.add("ankles");
        humanParts.add("feet");
        humanParts.add("toes");
        humanParts.add("thighs");
        humanParts.add("calves");
        humanParts.add("shins");
        humanParts.add("toenails");
        humanParts.add("fingernails");
        humanParts.add("hair");
        humanParts.add("eyebrows");
        humanParts.add("eyelashes");
        humanParts.add("forehead");
        humanParts.add("temples");
        humanParts.add("ears");
        humanParts.add("nose");
        humanParts.add("nostrils");
        humanParts.add("lips");
        humanParts.add("teeth");
        humanParts.add("tongue");
        humanParts.add("gums");
        humanParts.add("jaw");
        humanParts.add("chin");
        humanParts.add("cheeks");
        humanParts.add("throat");
        humanParts.add("lungs");
        humanParts.add("heart");
        humanParts.add("liver");
        humanParts.add("stomach");
        humanParts.add("intestines");
        humanParts.add("kidneys");
        humanParts.add("bladder");
        humanParts.add("pancreas");
        humanParts.add("spleen");
        humanParts.add("spine");
        humanParts.add("ribs");
        humanParts.add("shoulder blades");
        humanParts.add("collarbone");
        humanParts.add("pelvis");
        humanParts.add("hip bones");
        humanParts.add("thorax");
        humanParts.add("abdomen");
        humanParts.add("navel");
        humanParts.add("wrist");
        humanParts.add("femur");
        humanParts.add("tibia");
        humanParts.add("fibula");
        humanParts.add("ulna");
        humanParts.add("radius");
        humanParts.add("clavicle");
        humanParts.add("scapula");
        humanParts.add("humerus");
        humanParts.add("phalanges");
        humanParts.add("metacarpals");
        humanParts.add("metatarsals");
        humanParts.add("patella");
        humanParts.add("carpals");
        humanParts.add("tarsals");
        humanParts.add("vertebrae");
        humanParts.add("mandible");
        humanParts.add("maxilla");
        humanParts.add("radius");
        humanParts.add("ulna");
        humanParts.add("humerus");
        Iterator<String> humnIterate= humanParts.iterator();
        while (humnIterate.hasNext())
        {
            String str=humnIterate.next();
         if(str.length()<=5)
         {
             System.out.println(str);
         }
        }
    }
}
