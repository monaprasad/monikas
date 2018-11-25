package com.girnar.ems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Manager extends Execution {
	
	HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();
	HashMap<Integer, Manager1> manager = new HashMap<Integer, Manager1>();
	
	public void getEmployee() 
	{
		option();
		String option ="";
		while (true) {
			Scanner scr = new Scanner(System.in);
			option = scr.nextLine();
			switch (option) {
			case "A":
				System.out.println("Please enter the manager deatails :");
				getDetailsForManager();
				break;

			case "B":
				getDetailsForEmployee();
				break;

				
				default :
					System.out.println("please enter a valid value\n");
					option();
					break;

			}
		}

	}

	public void getDetailsForManager() {
//		HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();
		String choice = "1";
		choice = menuForManager();
		while (true) {
			System.out.println();
			switch (choice) {
			case "1":
				Scanner no = new Scanner(System.in);
				do {

					System.out.println("Please enter manager id");
					while (!no.hasNextInt()) {
						System.out.println("It's not a number. Please enter a valid no.");
						no.next(); // this is important!
					}
					int n = no.nextInt();

					String name;
					while (true) {
						System.out.println("Please enter manager name");
						name = no.next();
						try {
							int a = Integer.parseInt(name);
							System.out.println("Its not a string.Please enter the string");
							continue;
						} catch (Exception e) {

						}

						break;
					}
					String designation;
					while (true) {
						System.out.println("Please enter designation");
						designation = no.next();
						try {
							int a = Integer.parseInt(name);
							System.out.println("Its not a string.Please enter the string.");
							continue;
						} catch (Exception e) {

						}

						break;
					}
					Manager1 m = new Manager1();
					m.setSsn(n);
					m.setName(name);
					m.setDesignation(designation);
					// detailsEmployee.setSsn(n);
					// detailsEmployee.setName(name);
					// detailsEmployee.setDesignation(designation);

					manager.put(n, m);
					System.out.println("Do you want to add another manager deatails. (Yes/No) : ");
					String value = no.next();
					if (!value.equalsIgnoreCase("yes")) {
						break;
					}
				} while (true);
				getEmployee();
				break;

			case "2":
				Scanner scanner = new Scanner(System.in);

				System.out.println("Please enter the manager id you wish to retrive: ");
				int retStr = scanner.nextInt();

				if (manager.containsKey(retStr)) {

					Manager1 received_data = manager.get(retStr);
					System.out.println(received_data.toString());
					System.out.println("");

				}

				else {
					System.out.println("No such SSN.");
					System.out.println("");
				}

				break;

			case "3":
				Scanner scanner1 = new Scanner(System.in);
				System.out.println("Please enter the SSN of the employee you wish to delete: ");
				int idToDelete = scanner1.nextInt();
				if (manager.containsKey(idToDelete)) {
					Manager1 employee = new Manager1();
					employee = manager.get(idToDelete);
					manager.remove(idToDelete, employee);
					System.out.println("");

				}
				break;

			case "4":
				System.out.println("list all employees details :");

				for (Map.Entry r : manager.entrySet()) {
					System.out.println(r.getValue());
				}

				break;

			case "5":
				
				Scanner empSSN = new Scanner(System.in);
				System.out.println("change the employee designation via maanger id:");
				int emp_ssn = empSSN.nextInt();
				System.out.println("please enter the new designation :");
				Scanner newDesig = new Scanner(System.in);
				String newDesignation = newDesig.next();

				if (manager.containsKey(emp_ssn)) {
					Manager1 changeEMP = manager.get(emp_ssn);
					String des = changeEMP.getDesignation();
					changeEMP.setDesignation(newDesignation);
					manager.put(emp_ssn, changeEMP);
					System.out.println("");

				} else {
					System.out.println("No such SSN ");
				}
				break;

			case "6":
				getEmployee();
				break;

			default:
				
				menuForManager();
				break;

			}
			choice = menuForManager();
		}
	}
		public void getDetailsForEmployee()
		{
//			HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();
			String choice = "1";
			choice = menuForEmployee1();
			while (true) {
				System.out.println();
				switch (choice) {
				case "1":
					Scanner no = new Scanner(System.in);
					do {

						System.out.println("Please enter EMP_SSN");
						while (!no.hasNextInt()) {
							System.out.println("It's not a number. Please enter a valid no.");
							no.next(); // this is important!
						}
						int n = no.nextInt();

						String name;
						while (true) {
							System.out.println("Please enter name");
							name = no.next();
							try {
								int a = Integer.parseInt(name);
								System.out.println("Its not a string.Please enter the string");
								continue;
							} catch (Exception e) {

							}

							break;
						}
						String designation;
						while (true) {
							System.out.println("Please enter designation");
							designation = no.next();
							try {
								int a = Integer.parseInt(name);
								System.out.println("Its not a string.Please enter the string.");
								continue;
							} catch (Exception e) {

							}

							break;
						}
						Employee employee = new Employee();
						employee.setSsn(n);
						employee.setName(name);
						employee.setDesignation(designation);
						// detailsEmployee.setSsn(n);
						// detailsEmployee.setName(name);
						// detailsEmployee.setDesignation(designation);

						hm.put(n, employee);
					
						System.out.println("Do you want to add another employee deatails. (Yes/No) : ");
						String value = no.next();
						if (!value.equalsIgnoreCase("yes")) {
							break;
						}
					} while (true);
					getEmployee();
					break;

				case "2":
					Scanner input3 = new Scanner(System.in);

					System.out.println("Please enter the SSN of the employee you wish to retrive: ");
					int retStr = input3.nextInt();

					if (hm.containsKey(retStr)) {

						Employee received_data = hm.get(retStr);
						System.out.println(received_data.toString());
						System.out.println("");

					}

					else {
						System.out.println("No such SSN.");
						System.out.println("");
					}

					break;

				case "3":
					Scanner input2 = new Scanner(System.in);
					System.out.println("Please enter the SSN of the employee you wish to delete: ");
					int idToDelete = input2.nextInt();
					if (hm.containsKey(idToDelete)) {
						Employee employee = new Employee();
						employee = hm.get(idToDelete);
						hm.remove(idToDelete, employee);
						System.out.println("");

					}
					break;

				case "4":
					System.out.println("list all employees details :");

					for (Map.Entry r : hm.entrySet()) {
						System.out.println(r.getValue());
					}

					break;

				case "5":
					
					Scanner empSSN = new Scanner(System.in);
					System.out.println("change the employee designation via empSSN:");
					int emp_ssn = empSSN.nextInt();
					System.out.println("please enter the new designation :");
					Scanner newDesig = new Scanner(System.in);
					String newDesignation = newDesig.next();

					if (hm.containsKey(emp_ssn)) {
						Employee changeEMP = hm.get(emp_ssn);
						String des = changeEMP.getDesignation();
						changeEMP.setDesignation(newDesignation);
						hm.put(emp_ssn, changeEMP);
						System.out.println("");

					} else {
						System.out.println("No such SSN ");
					}
					break;

				case "6":
					getEmployee();
					break;

				default:
					menuForEmployee1();
					break;

				}
				choice = menuForEmployee1();
			}
		
		
	}
}
