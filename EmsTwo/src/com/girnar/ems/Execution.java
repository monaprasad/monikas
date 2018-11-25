package com.girnar.ems;

import java.util.*;

public class Execution
{
	public static void option()
	{
		System.out.println("Choose one option ");
		System.out.println("A) Director functionality");
	  	System.out.println("B) Manager functionality :");
	  	System.out.println("C) Employee  functionality:");
	  	
	
	}
  public static String menuForEmployee1()
  {
    System.out.println("Choose one option from following : ");
  	System.out.println("1) Add a new employee.");
  	System.out.println("2) Retrive an employee via emp_ssn.");
  	System.out.println("3) Delele an employee via emp_ssn");
  	System.out.println("4) List all employees.");
  	System.out.println("5) Change the Role management");
  	System.out.println("6) Exit.");
  	Scanner sc = new Scanner(System.in);
  	return sc.next();
  }
  
  public static String menuForManager()
  {
    System.out.println("Choose one option from following : ");
  	System.out.println("1) Add a new manager.");
  	System.out.println("2) Retrive the maanger details via manager id.");
  	System.out.println("3) Delele  manager via manager id");
  	System.out.println("4) list all manager.");
  	System.out.println("5) Change the Role management");
  	System.out.println("6) Exit.");
  	Scanner sc = new Scanner(System.in);
  	return sc.next();
  }

  public static void main(String[] args)
   {
	 Manager manager=new Manager();
	  manager.getEmployee();
	 
   }
}
  
 
  


