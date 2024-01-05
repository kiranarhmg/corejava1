package com.xworkz;

public class Metro extends BangloreAirportMetro{
    @Override
    public void metroLineType() {
        System.out.println("metro line type is purple");
    }

    @Override
    void metroFrom() {
        System.out.println("mejastic to airport");
    }

    public static void main(String[] args) {
        BangloreAirportMetro bangloreAirportMetro=new Metro();
        bangloreAirportMetro.metroFrom();
        bangloreAirportMetro.metroLineType();
    }
}
