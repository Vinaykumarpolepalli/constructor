package com.constructor;

public class ConstructorSir {
	//If a class don't have any other constructors
	//then only "Java compiler" will create the default constructor.
	//If we have any parameterized constructors
	//then java compiler will not create
	//any default constructor so we must need to have no-arg constructor.


	//Whenever we are creating an object,
	//if we want to send the data through object itself then will go for parameterized constructor.

		// Declare the instance variables
		 int pid;
		 String pname;
		 double price;
//		// no-arg constructor
		ConstructorSir() {
			System.out.println("Hello no arg constructor !");
		}
		ConstructorSir(int pid, String pname, double price) {
			System.out.println("parameterized constructor called !");
			this.pid = pid;
			this.pname = pname;
			this.price = price;
		}
	
		public static void main(String[] args) {
			System.out.println("main method started !");
			// passing the values while creating an object
			ConstructorSir p1 = new ConstructorSir(123, "one plus", 40000.00);
			// Accessing the instance data using object reference variable
			System.out.println(p1.pid);//
			System.out.println(p1.pname);//
			System.out.println(p1.price);//
			// Creating an object with the help of default constructor
			// Creating an object with the help of no-arg constructor
			ConstructorSir p= new ConstructorSir();
	//
////			// Assigned the values
			p.pid = 101;
			p.pname = "iphone14";
			p.price = 75000.00;
	//
//			// Accessing the instance data using object reference variable
			System.out.println(p.pid);// 0
			System.out.println(p.pname);// null
			System.out.println(p.price);// 0.0
			
			
		}
	}

