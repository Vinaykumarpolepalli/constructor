package com.constructor;

public class Constructor2 {
       String heroname;
       String moviename;
       String review;
       int moviebuget;
       int ticketprice;
       
       
       Constructor2(){
    	  System.out.println("no argument constructor");
       }
       
       
      
   
	
	Constructor2(String heroname){
		this.heroname=heroname;
		System.out.println("hero name is:"+heroname);
		
		
	}
	Constructor2(String heroname,String moviename){
		this.heroname=heroname;
		this.moviename=moviename;
		System.out.println("hero name is:"+heroname);
	    System.out.println("moviename is : "+moviename);
	}
	
	Constructor2(String heroname,String moviename,String review){
		this.moviename=moviename;
		System.out.println("hero name is:"+heroname);
	    System.out.println("moviename is : "+moviename);
	    System.out.println("movie review is :"+review);
	}
	
	Constructor2(String heroname,String moviename,String review,int moviebuget ){
		this.moviename=moviename;
		System.out.println("hero name is:"+heroname);
	    System.out.println("moviename is : "+moviename);
	    System.out.println("movie review is :"+review);
	    System.out.println("movie buget is :"+moviebuget);
	    
	}
	
//	Constructor2(String heroname,String moviename,String review,int moviebuget ,int ticketprice )
//		this.heroname = heroname;
//		this.moviename = moviename;
//		this.review = review;
//		this.moviebuget = moviebuget;
//		this.ticketprice = ticketprice;
//		System.out.println("hero name is:"+heroname);
//	    System.out.println("moviename is : "+moviename);
//	    System.out.println("movie review is :"+review);
//	    System.out.println("movie buget is :"+moviebuget);
//	    System.out.println("movie price  is :"+ticketprice);
//	    
//	}
	
    
	public Constructor2(String heroname, String moviename, String review, int moviebuget, int ticketprice) {
		this.heroname = heroname;
		this.moviename = moviename;
		this.review = review;
		this.moviebuget = moviebuget;
		this.ticketprice = ticketprice;
	}
//	
	
	public static void main(String[] args) {
		
		Constructor2 c  = new Constructor2();
		Constructor2 c1  = new Constructor2("prabhas","bahuballi","hit",1000,250);
		Constructor2 c2 = new Constructor2("pavan kayalan");
		Constructor2 c3 = new Constructor2("pavan kayalan","OG");
		Constructor2 c4 = new Constructor2("pavan kayalan","OG","super hit");
		Constructor2 c5 = new Constructor2("pavan kayalan","OG","super hit",1000);
		Constructor2 c6 = new Constructor2("pavan kayalan","OG","super hit",1000,250);
		
		
		System.out.println("hero name is:"+c2.heroname);
	    System.out.println("moviename is : "+c2.moviename);
	    System.out.println("movie review is :"+c2.review);
	    System.out.println("movie buget is :"+c2.moviebuget);
	    System.out.println("movie price  is :"+c2.ticketprice);
	
		c1.ott();
		
		c.ott();
	}
	 void ott() {
		
		    System.out.println("hero name is:"+heroname);
			System.out.println("movie name is:"+moviename);
			System.out.println("movie review is:"+review);
			System.out.println("movies buget is:"+moviebuget);
			System.out.println("ticket pric is:"+ticketprice);
	}

}
