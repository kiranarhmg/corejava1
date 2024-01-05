package com.xworkz;

public class UsbStarter {
    public static void main(String[] args) {
        UsbHub usbHub=new UsbHub(4,400,2);
        UsbHub usbHub1=new UsbHub(4,400,2);
        UsbHub usbHub2=new UsbHub(4,400,3);
      boolean ref=  usbHub.equals(usbHub1);
        System.out.println(ref);

       ref= usbHub1.equals(usbHub2);
        System.out.println(ref);

      ref=  usbHub2.equals(null);
        System.out.println(ref);

        WifiDongal wifiDongal=new WifiDongal("jio",200,300);
         ref= usbHub2.equals(wifiDongal);
        System.out.println(ref);

    }
}
