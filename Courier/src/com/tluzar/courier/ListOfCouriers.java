package com.tluzar.courier;

import java.util.LinkedList;
import java.util.List;

public class ListOfCouriers {
	
	
	 public static List<Package> getPackages() {
	        LinkedList packages = new LinkedList();
	        packages.add(new Package(19));
	        packages.add(new Package(Status.POSTED, 20, 1));
	        packages.add(new Package(30));
	        packages.add(new Package(Status.POSTED, 59, 1));
	        packages.add(new Package(Status.POSTED, 21, 2));
	        packages.add(new Package(33));
	        packages.add(new Package(Status.POSTED, 22, 3));
	        return packages;
	    }

	    public static List<Courier> getCouriers() {
	        LinkedList couriers = new LinkedList();
	        couriers.add(new Courier("Jan Jankowski", 1));
	        couriers.add(new Courier("Kamil Kowalski", 2));
	        couriers.add(new Courier("Dominik Nowakowski", 3));
	        return couriers;
	    }

}
