package com.constructor;

public class Constructor {
	String moviename;
	String heroname;
	String heroinname;
	int moviebuget;
	int ticketprice;

	Constructor() {
		this("Bahuballi");
		System.out.println("welcome to Telugu film Industy ");
	}

	Constructor(String moviename) {
		this("bahuballi", "prabhas");
		this.moviename = moviename;
	}
	
	Constructor(String moviename,String heroname){
		this("Bahuballi","Prabhas","Anushka");
		this.moviename = moviename;
	
		
	}
	Constructor(String moviename,String heroname,String heroinname){
		this("Bahuballi","Prabhas","Anushka",550);
		this.moviename = moviename;
		this.heroname=heroname;
		this.heroinname=heroinname;
	
	}
	Constructor(String moviename,String heroname,String heroinname,int moviebuget){
		this("Bahuballi","Prabhas","Anushka",2550,250);
		this.moviename = moviename;
		this.heroname=heroname;
		this.heroinname=heroinname;
		this.moviebuget=moviebuget;
		//this.ticketprice=ticketprice;
	}
	
	Constructor(String moviename,String heroname,String heroinname,int moviebuget,int ticketprice){
		this.moviename = moviename;
		this.heroname=heroname;
		this.heroinname=heroinname;
		this.moviebuget=moviebuget;
		this.ticketprice=ticketprice;
		
	}

	public static void main(String[] args) {
		System.out.println("Main Method is started here man ");
		Constructor c = new Constructor();
		c.display();
		Constructor c1 = new Constructor("OG");
		c1.display();
		Constructor c2 = new Constructor("OG","pavan kalyan");
		c2.display();
		Constructor c3 = new Constructor("OG","pavan kalyan","Priyanka");
		c3.display();
		Constructor c4 = new Constructor("OG","pavan kalyan","Priyanka",500);
		c4.display();
		Constructor c5 = new Constructor("OG","pavan kalyan","Priyanka",500,250);
		c5.display();
	}

	void display() {
		System.out.println("movie name is :" + moviename);
		System.out.println("heroname is :"+heroname);
		System.out.println("herpinname is :"+heroinname);
		System.out.println("moviebuget is :"+moviebuget);
        System.out.println("ticket price is :"+ticketprice);
	}
}
