package com.xworkz.profile.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StatueCollection {
    public static void main(String[] args) {
        Collection<String> statue=new ArrayList<>();

        statue.add("Vivekananda Statue");
        statue.add("Statue of Unity");
        statue.add("Shivaji Maharaj Statue");
        statue.add("Buddha Statue of Hyderabad");
        statue.add("Sardar Patel Statue");
        statue.add("Basaveshwara Statue");
        statue.add("Mahatma Gandhi Statue");
        statue.add("Mother Teresa Statue");
        statue.add("Shankaracharya Statue");
        statue.add("Adiyogi Shiva Statue");
        statue.add("Subhas Chandra Bose Statue");
        statue.add("Bhagat Singh Statue");
        statue.add("Dr. B.R. Ambedkar Statue");
        statue.add("Netaji Subhas Chandra Bose Statue");
        statue.add("Lal Bahadur Shastri Statue");
        statue.add("Saraswati Statue");
        statue.add("Nehru Statue");
        statue.add("Lokmanya Tilak Statue");
        statue.add("Rani Padmini Statue");
        statue.add("Chhatrapati Shivaji Statue");
        statue.add("Rabindranath Tagore Statue");
        statue.add("Sri Krishna Statue");
        statue.add("Sivaji Ganesan Statue");
        statue.add("Kamarajar Statue");
        statue.add("Durga Mata Statue");
        statue.add("Hanuman Statue");
        statue.add("Nataraja Statue");
        statue.add("Jhansi Ki Rani Statue");
        statue.add("Bhagwan Swaminarayan Statue");
        statue.add("Guru Nanak Dev Statue");
        statue.add("Rani Ahilyabai Holkar Statue");
        statue.add("Sant Tukaram Statue");
        statue.add("Sai Baba Statue");
        statue.add("Chatrapathi Sivaji Maharaj Statue");
        statue.add("B.R. Ambedkar Statue, Lucknow");
        statue.add("Bhagwan Mahavir Statue");
        statue.add("Mother Mary Statue");
        statue.add("MGR Statue");
        statue.add("Jawaharlal Nehru Statue");

        Iterator<String> statueIterate=statue.iterator();
        while (statueIterate.hasNext())
        {
            String str=statueIterate.next();
            if(str.endsWith("r"))
            {
                System.out.println("statue name ends with 'r':"+str);
            }
            else {
                System.out.println("statue name not ends with 'r':"+str);
            }
        }

    }
}
