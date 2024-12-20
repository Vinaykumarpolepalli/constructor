package com.constructor;

public class Bike {
	
	String bikebrand;
	String bikemodel;
	String bikeshowroom; 
	int bikeprice;
	int  mileage;
	
	Bike(){
	   System.out.println("no Argument constructor");
	}
	
	

	 Bike(String bikebrand, String bikemodel, String bikeshowroom, int bikeprice, int mileage) {
		
		System.out.println("Parameterized constructor");
		
		this.bikebrand = bikebrand;
		this.bikemodel = bikemodel;
		this.bikeshowroom = bikeshowroom;
		this.bikeprice = bikeprice;
		this.mileage = mileage;
		    
	  
	}
	
	Bike(String bikebrand){
		this. bikebrand=bikebrand;
		System.out.println("Single parameterized");
		
		 
	}
	
	Bike(String bikebrand,String bikemodel){
		this.bikebrand=bikebrand;
		this.bikemodel=bikemodel;
		System.out.println("two parameterized");
	}
		
		
	
	Bike(String bikebrand, String bikemodel, String bikeshowroom){
		this.bikebrand = bikebrand;
		this.bikemodel = bikemodel;
		this.bikeshowroom = bikeshowroom;
		System.out.println("Three parameterized ");
		
		
	}
	
	Bike(String bikebrand, String bikemodel, String bikeshowroom, int bikeprice){
		this.bikebrand = bikebrand;
		this.bikemodel = bikemodel;
		this.bikeshowroom = bikeshowroom;
		this.bikeprice = bikeprice;
		System.out.println("Four parameterized");
	}
	
	

	public static void main(String[] args) {
		System.out.println("Main Method is Started here");
	
     	
		
//		b. bikebrand = "tvs";
//		b. bikemodel =  "ntorq";
//	    b. bikeshowroom = "Hyd"; 
//		b. bikeprice   =125000 ;
//		b.  mileage = 38;
//		
		String bikebrand = "tvs";
		String bikemodel =  "ntorq";
	    String bikeshowroom = "Hyd"; 
		int bikeprice   =125000 ;
		int   mileage = 38;
		
		
		
		    Bike b1 =new Bike("royal enfield","bs4","Hyd",255000,30);
		    System.out.println("Bike Brand is :"+ b1.bikebrand);
			System.out .println("Bike Model is :"+b1.bikemodel);
			System.out .println("Bike showroom is :"+b1.bikeshowroom);
			System.out .println("Bike price is :"+b1.bikeprice);
			System.out .println("Bike mileage is :"+b1.mileage);
		
			
			

			Bike b = new Bike();
			System.out.println("Bike Brand is :"+b.bikebrand);
			System.out .println("Bike Model is :"+b.bikemodel);
			System.out .println("Bike showroom is :"+b.bikeshowroom);
			System.out .println("Bike price is :"+b.bikeprice);
			System.out .println("Bike mileage is :"+b.mileage);
			
			System.out.println("Bike Brand is :"+bikebrand);
			System.out .println("Bike Model is :"+bikemodel);
			System.out .println("Bike showroom is :"+bikeshowroom);
			System.out .println("Bike price is :"+bikeprice);
			System.out .println("Bike mileage is :"+mileage);
			
		
		   Bike b2 = new Bike("ola");
		   System.out.println("bike brand:"+b2.bikebrand);
		   
		   
		   Bike b3 = new Bike("ola","s1pro");
		   System.out.println("bike brand:"+b3.bikebrand);
		   System.out.println("bike model:"+b3.bikemodel);
		   
		   
		   Bike b4 = new Bike("ola","s1pro","mudigubba");
		   System.out.println("bike brand:"+b4.bikebrand);
		   System.out.println("bike model:"+b4.bikemodel);
		   System.out .println("Bike showroom is :"+b4.bikeshowroom);
		   
		   Bike b5 = new Bike("ola","s1pro","mudigubba",125000);
		   System.out.println("bike brand:"+b5.bikebrand);
		   System.out.println("bike model:"+b5.bikemodel);
		   System.out .println("Bike showroom is :"+b5.bikeshowroom);
		   System.out .println("Bike price is :"+b5.bikeprice);
		  
		   Bike b6 = new Bike("ola","s1pro","mudigubba",125000,85);
		   System.out.println("bike brand:"+b6.bikebrand);
		   System.out.println("bike model:"+b6.bikemodel);
		   System.out .println("Bike showroom is :"+b6.bikeshowroom);
		   System.out .println("Bike price is :"+b6.bikeprice);
		   System.out .println("Bike mileage is :"+b6.mileage);
	}

}

















//System.out.println("Bike Brand is :"+b. bikebrand);
//System.out .println("Bike Model is :"+b.bikemodel);
//System.out .println("Bike showroom is :"+b.bikeshowroom);
//System.out .println("Bike price is :"+b.bikeprice);
//System.out .println("Bike mileage is :"+b.mileage);
