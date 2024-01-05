package com.xworkz;

public class ExpressWay extends BangloreChennaiExpressWay{

    @Override
    public void saveTime() {
        System.out.println("it saves time");
    }
    @Override
    void reahFastly()
    {
        System.out.println("we reach fast");
    }

    public static void main(String[] args) {
        BangloreChennaiExpressWay bangloreChennaiExpressWay=new ExpressWay();
        bangloreChennaiExpressWay.reahFastly();
        bangloreChennaiExpressWay.saveTime();
    }
}
