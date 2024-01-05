package com.xworkz;

public class WifiStarter {
    public static void main(String[] args) {
        WifiDongal wifiDongal=new WifiDongal("jio",200,300);
        WifiDongal wifiDongal1=new WifiDongal("jio",200,300);
        WifiDongal wifiDongal2=new WifiDongal("jio",20,300);
        wifiDongal.equals(wifiDongal1);
        wifiDongal.equals(wifiDongal2);
        wifiDongal.equals(null);
        Guitar guitar2=new Guitar(2,4000,"wood");
         wifiDongal.equals(guitar2);

    }
}
