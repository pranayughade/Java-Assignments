import java.util.*;

class CompanyDriverApp{
	public static void main(String[] x){
		Scanner sc = new Scanner(System.in);
		Company c = new Company();
		Employee[] e = new Employee[5];
			
			do{
				
				System.out.println("Press 1: Add Employee Details.");
				System.out.println("Press 2: Show Employee Details.");
				System.out.println("Press 3: Search Employee.");
				System.out.println("Press 4: Delete Employee data.");
				System.out.println("Press 5: Update Employee details");
				System.out.println("Press 6: Show employee in asce IDs");
				System.out.println("Press 7: Show employee in Desc salaries.");
				System.out.println("Press 8: Display the employee details in highest salary");
				System.out.println("Press 9: Display the employee details in lowest salary");
				
				int button = sc.nextInt();
				
				switch(button){
					case 1:
						System.out.println("=============================================");
						System.out.println("Enter 5 employees details: ");
						
						for(int i = 0; i<e.length; i++){
							e[i] = new Employee();
							System.out.println("Enter id, name, email, contact, address & salary of employee: ");
							
							int id = sc.nextInt(); sc.nextLine();
							String name = sc.nextLine();
							String email = sc.nextLine();
							int contact = sc.nextInt();
							sc.nextLine(); 
							String address = sc.nextLine();
							int salary = sc.nextInt();
							
							e[i].setId(id);
							e[i].setName(name);
							e[i].setEmail(email);
							e[i].setContact(contact);
							e[i].setSalary(salary);
							e[i].setAddress(address);
							System.out.println("-------------------------------------");
						}
						c.setEmployees(e);
						System.out.println("=============================================");
						
						break;
					
					case 2:
						
						c.showEmployeeDetails();
						break;
						
					case 3:{
					
						System.out.println("To search: Enter emp id, name, email, salary, address: ");
						System.out.print("Enter employee ID: ");
						int id = sc.nextInt();
						sc.nextLine(); 
						System.out.print("Enter employee Name: ");
						String name = sc.nextLine();
						System.out.print("Enter employee Email: ");
						String email = sc.nextLine();
						System.out.print("Enter employee Salary: ");
						int salary = sc.nextInt();
						sc.nextLine();
						System.out.print("Enter employee Address: ");
						String address = sc.nextLine();
        
						// Calling the method to display the collected info
						c.searchEmployee(id, name, email, salary, address); 
						
						break;
					}
					case 4:{
						
						System.out.println("To search: Enter emp id, name, email, salary, address: ");
						System.out.print("Enter employee ID: ");
						int id = sc.nextInt();
						sc.nextLine(); 
						System.out.print("Enter employee Name: ");
						String name = sc.nextLine();
						System.out.print("Enter employee Email: ");
						String email = sc.nextLine();
						System.out.print("Enter employee Salary: ");
						int salary = sc.nextInt();
						sc.nextLine();  
						System.out.print("Enter employee Address: ");
						String address = sc.nextLine();
						c.deleteEmployee(id, name, email, salary, address);
						
						break;
						
					}
					case 5:{
						
						System.out.println("To search: Enter emp id, name, email, salary, address: ");
						System.out.print("Enter employee ID: ");
						int id = sc.nextInt();
						sc.nextLine(); 
						System.out.print("Enter employee Name: ");
						String name = sc.nextLine();
						System.out.print("Enter employee Email: ");
						String email = sc.nextLine();
						System.out.print("Enter employee Salary: ");
						int salary = sc.nextInt();
						sc.nextLine();  
						System.out.print("Enter employee Address: ");
						String address = sc.nextLine();
						
						
						c.updateEmployee(id, name, email, salary, address);
						
						break;
						
					}
					case 6:{
						
						c.sortedByIdAscend();
						break;
					}
					case 7:{
						c.sortedBySalDescend();
						break;
					}
					case 8:{
						c.displayHighestSalaryEmp();
						break;
					}
					case 9:{
						c.displayLowesttSalaryEmp();
						break;
					}
					case 10:
						System.out.println("Logging out.....!"); break;
					default:
						System.out.println("Invalid entry, try again!!!");
					
						
					
					
				}
			}while(true);
	}
}