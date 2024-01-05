package com.xworkz;

public class Guitar {
    int id;
    double price;
    String material;


    public Guitar(int id, double price, String material) {
        this.id = id;
        this.price = price;
        this.material = material;
    }
    @Override
    public boolean equals(Object obj) {
        Guitar leftRef=this;
        if(obj!=null)
        {
            if(obj instanceof Guitar)
            {
                Guitar rightRef=(Guitar) obj;
                if(leftRef.id==rightRef.id && leftRef.price==rightRef.price)
                {
                    System.out.println("left ref and right ref are same");
                    return true;
                }
                else{
                    System.err.println("left ref and right ref are not same");
                }
            }
            else{
                System.err.println("obj is not instance of Guitar");
            }
        }
        else{
            System.err.println("obj is null");
        }
        return false;
    }



}
