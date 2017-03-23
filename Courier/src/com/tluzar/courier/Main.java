package com.tluzar.courier;

import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Iterator packages = ListOfCouriers.getPackages().iterator();

        while(packages.hasNext()) {
            Package pack = (Package)packages.next();
            if(pack.getStatus() != Status.DELIVERED) {
                System.out.println(pack);
            }
        }

        List packages1 = ListOfCouriers.getPackages();
        Iterator pack2 = ListOfCouriers.getCouriers().iterator();

        while(pack2.hasNext()) {
            Courier courier = (Courier)pack2.next();
            System.out.println("Kurier: " + courier);
            Iterator var4 = packages1.iterator();

            while(var4.hasNext()) {
                Package pack1 = (Package)var4.next();
                if(pack1.getRegion() == courier.getRegion() && pack1.getStatus() != Status.DELIVERED) {
                    System.out.println("\t" + pack1);
                }
            }
        }

	}

}
