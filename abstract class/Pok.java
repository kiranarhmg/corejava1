package com.xworkz;

public class Pok extends GetBackPok{

    @Override
    public void throughtLaw() {
        System.out.println("india will get it back throught law");
    }

    @Override
    void getBack()
    {
        System.out.println("india will fight for it");
    }

    public static void main(String[] args) {
        GetBackPok getBackPok=new Pok();

        getBackPok.getBack();
        getBackPok.throughtLaw();

        Pok pok=new Pok();
        pok.getBack();
        pok.throughtLaw();
    }
}
