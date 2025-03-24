import java.util.*;

class Company{
	Scanner sc = new Scanner(System.in);
	private Employee[] e;
	
	public void setEmployees(Employee... e){
		this.e = e;
	}
	public Employee[] getEmployees(){ return e; }
	
	//case 2
	
	public void showEmployeeDetails(){  
		if(e == null){System.out.println("No employees available."); return; }
		
		System.out.println("===================================================================================\n");
		System.out.println("ID\tEMPLOYEE NAME\t\tEMPLOYEE EMAIL\t\tCONTACT\t\tADDRESS\t\tSALARY");
		
		for(int i= 0; i<e.length; i++){
			if(e[i] != null){
				 System.out.printf("%-10d%-20s%-25s%-15s%-18s%-8d\n", 
                                  e[i].getId(), 
                                  e[i].getName(), 
                                  e[i].getEmail(), 
                                  e[i].getContact(), 
                                  e[i].getAddress(), 
                                  e[i].getSalary());
			}
		}
		System.out.println("===================================================================================\n");
		
	}
	
	//case 3
	public void searchEmployee(int id, String name, String email, int salary, String address) {
    System.out.println("===================================================================================\n");
   
    System.out.println("ID\tEMPLOYEE NAME\t\tEMPLOYEE EMAIL\t\tCONTACT\t\tADDRESS\t\tSALARY");

    
    for (int i = 0; i < e.length; i++) {
        if (e[i] != null) {
            int eid = e[i].getId();
            String ename = e[i].getName();
            String eemail = e[i].getEmail();
            int sal = e[i].getSalary();
            String ad = e[i].getAddress();
            int contact = e[i].getContact();  // Assuming this method exists in Employee class

            // Check if all criteria match
            if (eid == id && ename.equals(name) && eemail.equals(email) && sal == salary && ad.equals(address)) {
                
                System.out.printf("%-10d%-20s%-30s%-15s%-14s%-10d\n", 
                                  e[i].getId(), 
                                  e[i].getName(), 
                                  e[i].getEmail(), 
                                  e[i].getContact(), 
                                  e[i].getAddress(), 
                                  e[i].getSalary());
            }
        }
    }
	System.out.println("===================================================================================\n");
}

	
	//case 4
	
	public void deleteEmployee(int id, String name, String email, int salary, String address){
		
		System.out.println("===================================================================================\n");
		
			 System.out.println("ID\tEMPLOYEE NAME\t\tEMPLOYEE EMAIL\t\tCONTACT\t\tADDRESS\t\tSALARY");
			for(int i = 0; i<e.length; i++){
				if(e[i] != null){
					int eid = e[i].getId();
					String ename = e[i].getName();
					String eemail = e[i].getEmail();
					int sal = e[i].getSalary();
					String ad = e[i].getAddress();
				
				
				
					if(eid == id && ename.equals(name) && eemail.equals(email) && sal == salary && ad.equals(address)){
						System.out.println(e[i].getId() + "\t" + e[i].getName() + "\t" + e[i].getName() + "\t" + e[i].getEmail() + "\t" + e[i].getContact() + "\t" + e[i].getAddress() + "\t" + e[i].getSalary() );System.out.printf("%-10d%-20s%-30s%-15s%-14s%-10d\n", 
                                  e[i].getId(), 
                                  e[i].getName(), 
                                  e[i].getEmail(), 
                                  e[i].getContact(), 
                                  e[i].getAddress(), 
                                  e[i].getSalary());
					
					
						e[i]=null;
						System.out.println("Succesfully deleted record of " + ename);
					}
				}
			}
			System.out.println("===================================================================================\n");
		
	}
	
	//case 5
	public void updateEmployee(int id, String name, String email, int salary, String address){
		
			System.out.println("===================================================================================\n");
		
			 System.out.println("ID\tEMPLOYEE NAME\t\tEMPLOYEE EMAIL\t\tCONTACT\t\tADDRESS\t\tSALARY");
			System.out.println("-------------------------------------------------------------");
			for(int i = 0; i<e.length; i++){
				if(e[i] != null){
					int eid = e[i].getId(); 
					String ename = e[i].getName();
					String eemail = e[i].getEmail();
					int sal = e[i].getSalary();
					String ad = e[i].getAddress();
				
				
				
					if(eid == id && ename.equals(name) && eemail.equals(email) && sal == salary && ad.equals(address)){
						System.out.printf("%-10d%-20s%-30s%-15s%-14s%-10d\n", 
                                  e[i].getId(), 
                                  e[i].getName(), 
                                  e[i].getEmail(), 
                                  e[i].getContact(), 
                                  e[i].getAddress(), 
                                  e[i].getSalary());
					
						System.out.println("----------------------------------------------------");
						System.out.println("Update the employee details:");
						
						
						System.out.println("Enter id, name, email, contact, address & salary of employee: ");
						
					
						int uId = sc.nextInt(); sc.nextLine();
						String uName = sc.nextLine();
						String uEmail = sc.nextLine();
						int contact = sc.nextInt(); sc.nextLine();
						String uAddress = sc.nextLine();
						int uSalary = sc.nextInt(); 
						
						
						e[i].setId(uId);
						e[i].setName(uName);
						e[i].setEmail(uEmail);
						e[i].setSalary(uSalary);
						e[i].setAddress(uAddress);
						e[i].setContact(contact);
						
						System.out.println("Succesfully updated the info.");
						
						
					}
				}
			}
			System.out.println("===================================================================================\n");
		
	}
	
	//case 6
	public void sortedByIdAscend(){
		
		int count = 0;
		for(int i = 0; i<e.length; i++){
			if(e[i] != null){
				count++;
			}
			
		}
		Employee[] emp = new Employee[count];
		
		int index = 0;
		for (int i = 0; i < e.length; i++) {
			if (e[i] != null) {
				emp[index++] = e[i];
			}
		}
		
		for(int i = 0; i<emp.length-1; i++){
			for(int j = 0; j<emp.length-i-1; j++){
				int id1 = e[j].getId();
				int id2 =e[j+1].getId();
				if(id1>id2){
					Employee temp = emp[j];
					emp[j] = emp[j+1];
					emp[j+1] = temp;
				}
			}
		}
		System.out.println("===================================================================================\n");
		
		 System.out.println("ID\tEMPLOYEE NAME\t\tEMPLOYEE EMAIL\t\tCONTACT\t\tADDRESS\t\tSALARY");
		System.out.println("-------------------------------------------------------------");
		for(int i = 0; i<emp.length; i++){
			System.out.printf("%-10d%-20s%-30s%-15s%-14s%-10d\n", 
                                  emp[i].getId(), 
                                  emp[i].getName(), 
                                  emp[i].getEmail(), 
                                  emp[i].getContact(), 
                                  emp[i].getAddress(), 
                                  emp[i].getSalary());
		}
		System.out.println("===================================================================================\n");
	}
	
	
	
	public void sortedBySalDescend(){
		
		int count = 0;
		for(int i = 0; i<e.length; i++){
			if(e[i] != null){
				count++;
			}
			
		}
		Employee[] emp = new Employee[count];
		
		int index = 0;
		for (int i = 0; i < e.length; i++) {
			if (e[i] != null) {
				emp[index++] = e[i];
			}
		}
		
		for(int i = 0; i<emp.length-1; i++){
			for(int j = 0; j<emp.length-i-1; j++){
				int sal1 = e[j].getSalary();
				int sal2 =e[j+1].getSalary();
				if(sal1<sal2){
					Employee temp = emp[j];
					emp[j] = emp[j+1];
					emp[j+1] = temp;
				}
			}
		}
		
		System.out.println("===================================================================================\n");
		 System.out.println("ID\tEMPLOYEE NAME\t\tEMPLOYEE EMAIL\t\tCONTACT\t\tADDRESS\t\tSALARY");
		System.out.println("-------------------------------------------------------------");
		for(int i = 0; i<emp.length; i++){
			System.out.printf("%-10d%-20s%-30s%-15s%-14s%-10d\n", 
                                  emp[i].getId(), 
                                  emp[i].getName(), 
                                  emp[i].getEmail(), 
                                  emp[i].getContact(), 
                                  emp[i].getAddress(), 
                                  emp[i].getSalary());
		}
		System.out.println("===================================================================================\n");
	}
	
	
	
	//case 8
	public void displayHighestSalaryEmp(){
		if(e == null){ System.out.println("No employee found."); return; }
		
		System.out.println("===================================================================================\n");
		System.out.println("Employee with Highest salary is: ");
		 System.out.println("ID\tEMPLOYEE NAME\t\tEMPLOYEE EMAIL\t\tCONTACT\t\tADDRESS\t\tSALARY");
		System.out.println("-------------------------------------------------------------");
		
		int max = -1;
		for(int i = 0; i<e.length; i++){
			if(e[i] != null && e[i].getSalary()>max){
				max = e[i].getSalary();
			}
		}
		for(int i = 0; i<e.length; i++){
			if(e[i] != null && max == e[i].getSalary()){
				System.out.printf("%-10d%-20s%-30s%-15s%-14s%-10d\n", 
                                  e[i].getId(), 
                                  e[i].getName(), 
                                  e[i].getEmail(), 
                                  e[i].getContact(), 
                                  e[i].getAddress(), 
                                  e[i].getSalary());
			}
		}
		System.out.println("===================================================================================\n");
		
	}
	
	//case 9
	public void displayLowesttSalaryEmp(){
		if(e == null){ System.out.println("No employee found."); return; }
		
		System.out.println("===================================================================================\n");
		System.out.println("Employee with lowest salary is: ");
		System.out.println("ID" + "\t" +"EMPLOYEE NAME" + "\t" + "CONTACT" + "\t" + "ADDRESS" +"\t" + "SALARY");
		System.out.println("-------------------------------------------------------------");
		
		int min = Integer.MAX_VALUE;;
		for(int i = 0; i<e.length; i++){
			if(e[i] != null && e[i].getSalary()<min){
				min = e[i].getSalary();
			}
		}
		for(int i = 0; i<e.length; i++){
			if(e[i] != null && min == e[i].getSalary()){
				System.out.printf("%-10d%-20s%-30s%-15s%-14s%-10d\n", 
                                  e[i].getId(), 
                                  e[i].getName(), 
                                  e[i].getEmail(), 
                                  e[i].getContact(), 
                                  e[i].getAddress(), 
                                  e[i].getSalary());
			}
		}
		System.out.println("===================================================================================\n");
		
	}
	
	
	public void serchEmpById(int id){
		for(int i = 0; i<e.length; i++){
			if(e[i].getId() == id){
				System.out.println(e[i].getID() + " " + e[i].getName() +  " " +e[i].getContact() + " " + e[i].getEmail() + " " + e[i].getAddress() + " " +  e[i].getSalary() );
			}
		}
	}
	
	public void searchEmpByName(String name){
		for(int i = 0; i<e.length; i++){
			if(e[i].getName().equals(name)){
				System.out.println(e[i].getID() + " " + e[i].getName() +  " " +e[i].getContact() + " " + e[i].getEmail() + " " + e[i].getAddress() + " " +  e[i].getSalary() );
			}
		}
	}
	
	public void serchEmpByAddress(String ad ){
		for(int i = 0; i<e.length; i++){
			if(e[i].getId() == id){
				System.out.println(e[i].getID() + " " + e[i].getName() +  " " +e[i].getContact() + " " + e[i].getEmail() + " " + e[i].getAddress() + " " +  e[i].getSalary() );
			}
		}
	}
	public void serchEmpByEmail(int id){
		for(int i = 0; i<e.length; i++){
			if(e[i].getId() == id){
				System.out.println(e[i].getID() + " " + e[i].getName() +  " " +e[i].getContact() + " " + e[i].getEmail() + " " + e[i].getAddress() + " " +  e[i].getSalary() );
			}
		}
	}
	

	
	
}