package com.cg;

public class Employeeref {
 int empid;
 String firstname;
 String lastname;
 String grade;
  int salary;
  Date joiningDate;
  static int count=0;
 public Employeeref(){
	 firstname= "";
	 lastname= "";
	 salary= 0;
	 grade= "";
 }
  
 public Employeeref(String firstname,String lastname,String grade,int salary,Date joiningDate){
	 count++;
	 this.empid = +count;
	 this.firstname = firstname;
	 this.lastname = lastname;
	 this.grade = grade;
	 this.salary = salary;
	 this.joiningDate = joiningDate;
 }
 
 public void displayDetails()
 {
	 System.out.println("empid"+ empid);
	 System.out.println("firstname"+ firstname);
	 System.out.println("lastname"+ lastname);
	 System.out.println("Grade"+ grade);
	 System.out.println("salary"+ salary);
	 System.out.println("Date of Joining"+ joiningDate);
 }
 
	public Invoice[] getInvoices(){
		return null;
	}
	class Invoice{
		
	}

}
