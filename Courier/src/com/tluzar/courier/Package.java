package com.tluzar.courier;

public class Package {
	
	  private Status status;
	  private int number;
	  private int region;

	    public Package(int number) {
	    	this.status = Status.DELIVERED;
	        this.number = number;
	    }

	    public Package(Status status, int number) {
	        this.status = Status.DELIVERED;
	        this.status = status;
	        this.number = number;
	    }
	    
	    public Package(Status status, int number, int region) {
	        this.status = Status.DELIVERED;
	        this.status = status;
	        this.number = number;
	        this.region = region;
	    }

		public Status getStatus() {
			return status;
		}

		public void setStatus(Status status) {
			this.status = status;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public int getRegion() {
			return region;
		}

		public void setRegion(int region) {
			this.region = region;
		}

		@Override
		public String toString() {
			return "Package [status=" + status + ", number=" + number + ", region=" + region + "]";
		}
	    
}
