package com.xworkz;

public class GuitarStarter {
    public static void main(String[] args) {
        Guitar guitar=new Guitar(1,4000,"wood");
        Guitar guitar1=new Guitar(1,4000,"wood");
       boolean ref= guitar.equals(guitar1);
        System.out.println(ref);
        Guitar guitar2=new Guitar(2,4000,"wood");
        Guitar guitar3=new Guitar(1,4000,"metal");
     ref= guitar2.equals(guitar3);
        System.out.println(ref);

       ref= guitar2.equals(null);
        System.out.println(ref);

        WifiDongal wifiDongal=new WifiDongal("jio",200,300);
       ref=guitar2.equals(wifiDongal);
        System.out.println(ref);


    }
}
