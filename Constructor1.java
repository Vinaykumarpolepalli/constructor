package com.constructor;

public class Constructor1 {
	
	int stdid;
	String stdname;
	double stdfees;
	
	
	//no argument constructor
			Constructor1 (){
				System.out.println("no argument constructor");
			}
			
			//parameterized constructor
			Constructor1  (int stdid,String stdname,double stdfees){
				System.out.println("parameterized constructors");
			   this. stdid=stdid;
			   this.stdname=stdname;
			   this.stdfees=stdfees;
			}
			
	
	

	public static void main(String[] args) {
		System.out.println("Main Method started");
		Constructor1 c = new Constructor1();
		
		
		int stdid= 21;
		String stdname= "vinay";
		double stdfees= 30000.00;
		
		//parameterized constructors
		Constructor1 c1 = new Constructor1(30,"guru",24000.00);
		System.out.println(c1.stdid);
		System.out.println(c1.stdname);
		System.out.println(c1.stdfees);
        
		//local variables
		System.out.println("Local varibles constructors");
		System.out.println(stdid);
		System.out.println(stdname);
		System.out.println(stdfees);
		
		// default constructor
		System.out.println("default constructor");
		System.out.println(c.stdid);
		System.out.println(c.stdname);
		System.out.println(c.stdfees);
		
		
		

	}

	
}
