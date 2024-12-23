package com.constructor;


public class Movie {
	String mName;
	String hName;
	String heName;
	long budget;
	String dName;
	Movie(){
		this("bahubali");
		System.out.println("welcome to the movie:");
	}
	Movie(String mName){
		this("bahubali","prabhas");
		this.mName=mName;	
	}
	Movie(String mName,String hName){
		this("bahubali","prabhas","anushka");
		this.mName=mName;
		this.hName=hName;
	}
	public Movie(String mName, String hName, String heName) {
		this("bahubali","prabhas","anushka",200);
		this.mName = mName;
		this.hName = hName;
		this.heName = heName;
	}
	
	public Movie(String mName, String hName, String heName, long budget) {
		this("bahubali","prabhas","anushka",200,"rajamouli");
		this.mName = mName;
		this.hName = hName;
		this.heName = heName;
		this.budget = budget;
	}
	
	public Movie(String mName, String hName, String heName, long budget, String dName) {
		this.mName = mName;
		this.hName = hName;
		this.heName = heName;
		this.budget = budget;
		this.dName = dName;
	}
	public static void main(String[] args) {
		Movie m=new Movie();
		m.display();
		Movie m1=new Movie("OG");
		m1.display();
		Movie m2=new Movie("OG","pawan Kalyan");
		m2.display();
		Movie m3=new Movie("OG","Pawan Kalyan","priyanka mohan");
		m3.display();
		Movie m4=new Movie("OG","pawan Kalyan","priyanka mohan",200);
		m4.display();
		Movie m5=new Movie("OG","pawan Kalyan","priyanka mohan",200,"sujeeth");
		m5.display();

	}
	void display() {
		System.out.println("MOVIE NAME :"+mName);
		System.out.println("MOVIE HERO NAME :"+hName);
		System.out.println("MOVIE HEROIN NAME :"+heName);
		System.out.println("MOVIE BUDGET :"+budget);
		System.out.println("MOVIE DIRECTOR NAME :"+dName);
	}

}