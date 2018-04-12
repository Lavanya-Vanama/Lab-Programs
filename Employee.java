package com.cg;
import java.util.*;
public class Employee {

	static int count=0;
		
		@SuppressWarnings("resource")
		public static void main(String[] args){
		int i;
	        Scanner sc=new Scanner(System.in);
	      for (i=1;i<5;i++)
	                {
		count++;	

		System.out.println("Enter your firstname");
	        String firstName=sc.next();
		
		System.out.println("Enter your lastname");
	        String lastName=sc.next();

	        System.out.println("Enter your salary");
	        int salary=sc.nextInt();

		System.out.println("Enter your grade");
	        String grade=sc.next();

		System.out.println("Enter your date of joining");
	        int dojd=sc.nextInt();
			if(dojd <= 01 || dojd >= 31 ){
				System.out.println("date should be between 01 and 31");
				System.out.println("Enter your date of joining");
				dojd = sc.nextInt();
			}
			System.out.println("Enter your month of joining");
			int dojm=sc.nextInt();
			if(dojm <=1 || dojm >=12){
				System.out.println("month should be between 01 and 12");
				System.out.println("Enter your month of joining");
				dojm = sc.nextInt();
			}
			System.out.println("Enter your year of joining");
			int dojy=sc.nextInt();
			if(dojy <=1900 || dojy >=2099){
				System.out.println("enter a valid year");
				System.out.println("Enter your year of joining");
				dojy = sc.nextInt();
			}
				
			 Date joiningDate = null;
	         joiningDate = new Date(dojd, dojm, dojy);
			
	         Employeeref e = null; 
	         e = new Employeeref(firstName, lastName, grade, salary,joiningDate);
   
	       System.out.println("date of joining" +joiningDate.toString());
	        e.displayDetails();
	       e.getInvoices();
		
	 }
		
		System.out.println("No.of employees created are:" +count);	
			
			


	              
	        	
		}
	}

