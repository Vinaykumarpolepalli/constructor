package com.constructor;

public class Student {
	
	int studentid;
	int studentfees;
	String studentname;
	String studentcourse;
	String studentinstname ;
	
	Student(){
		System.out.println("No argument constructors is here: ");
	}
	
	

	Student(int studentid){
		this.studentid=studentid;
		System.out.println("one argument ");
	}
	
	Student(int studentid,int studentfees){
		this.studentid=studentid;
		this.studentfees=studentfees;
		System.out.println("two argument ");
		
	}
	
	Student(int studentid,int studentfees,String studentname,String studentcourse,String studentinstname ){
		this.studentid = studentid;
		this.studentfees=studentfees;
		this.studentname=studentname;
		this.studentcourse=studentcourse;
		this.studentinstname=studentinstname;
		System.out.println("Parameterized constructors is there");
	}
	
	

	public static void main(String[] args) {
		System.out.println("Main Method is started is here mava");
		
		Student s1 = new Student(21,24000,"vinay kuumar","java full stack","vcube");
		System.out.println("Student id is :"+s1.studentid);
		System.out.println("Student fess is :"+s1.studentfees);
		System.out.println("Student name is :"+s1.studentname);
		System.out.println("Student course is :"+s1.studentcourse);
		System.out.println("Student inst name is :"+s1.studentinstname);
		
		Student s =new Student();
		
		System.out.println("Student id is :"+s.studentid);
		System.out.println("Student fess is :"+s.studentfees);
		System.out.println("Student name is :"+s.studentname);
		System.out.println("Student course is :"+s.studentcourse);
		System.out.println("Student inst name is :"+s.studentinstname);
         
		int studentid=145;
		int studentfees= 26000;
		String studentname = "naveen";
		String studentcourse="java full stack";
		String studentinstname= "vcube";
		
		System.out.println("Student id is :"+studentid);
		System.out.println("Student fess is :"+studentfees);
		System.out.println("Student name is :"+studentname);
		System.out.println("Student course is :"+studentcourse);
		System.out.println("Student inst name is :"+studentinstname);
		
		
		Student s2 = new Student(22);
		System.out.println("Student id is :"+s2.studentid);
		
		
		Student s3= new Student(30,25000);
	    System.out.println("Student id is :"+s3.studentid);
		System.out.println("Student fees is:"+s3.studentfees);
		
		
		
	}

}
