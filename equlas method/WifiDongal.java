package com.xworkz;

public class WifiDongal {
      String brand;
      double transferRate;
      double itemWeight;

    public WifiDongal(String brand, double transferRate, double itemWeight) {
        this.brand = brand;
        this.transferRate = transferRate;
        this.itemWeight = itemWeight;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            if(obj instanceof WifiDongal)
            {
                WifiDongal rightRef=(WifiDongal) obj;
                if(this.itemWeight==rightRef.itemWeight && this.transferRate==rightRef.transferRate)
                {
                    System.out.println("left ref and right ref are same" );
                    return true;
                }
                else{
                    System.err.println("left ref and right ref are not same" );

                }
            }
            else{
                System.err.println("obj is not instance of WifiDongal");
            }
        }
        else{
            System.err.println("obj is null");
        }
        return false;
    }
}
