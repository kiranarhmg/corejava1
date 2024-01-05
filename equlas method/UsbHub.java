package com.xworkz;

public class UsbHub {
    int totalPorts;
    int transferRate;
    int batteryRequired;

    public UsbHub(int totalPorts, int transferRate, int batteryRequired) {
        this.totalPorts = totalPorts;
        this.transferRate = transferRate;
        this.batteryRequired = batteryRequired;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            if(obj instanceof UsbHub)
            {
                UsbHub rightRef=(UsbHub) obj;
                if(this.totalPorts==rightRef.totalPorts && this.transferRate==rightRef.transferRate && this.batteryRequired==rightRef.batteryRequired)
                {
                    System.out.println("left ref and right ref are same" );
                    return true;
                }
                else{
                    System.err.println("left ref and right ref are not same" );

                }
            }
            else{
                System.err.println("obj is not instance of usb hub");
            }
        }
        else{
            System.err.println("obj is null");
        }
        return false;
    }
}
