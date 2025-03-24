//Q5.  Write a java Program to calculate overtime pay of 5 employees. The overtime pay rate is 
//	Rs.50/- (per Hour). Daily shift hour time is only 8 hours. 
			
//Note- for a week only 40 hours of working are allowed. 
//1. Create class Employee with data member ID, Name, total working, salary, overtime
//Set Information by using a constructor and create a display Information() method to
//display all information with salary.
//2. Create Driver class name as OverTime with method setEmployee(Employee emp[]) and 
//void calculateOvertime() to calculate overtime. 

class Employee{
	final int salPerHour = 50;
	private int id;
	private String name;
	private int tWorkHours;
	private int salary;
	private int overtime;
	
	//Rs.50/- (per Hour). Daily shift hour time is only 8 hours. 
	
	Employee(int id, String name, int tWorkHours){
		
		this.id = id;
		this.name = name;
		this.tWorkHours = tWorkHours;
		this.salary = tWorkHours * salPerHour;
		this.overtime = tWorkHours>160? (tWorkHours-160) : 0;
	}
	
	void displayInfo(){
		
		
		System.out.println("Id: " + this.id + "\n" + "Name: " + this.name + "\n" + "Total Working days: " + tWorkHours + "\n" + "Overtime hours of emp: " + overtime + "\n" + "Salary of employee is : " + salary + " INR\n");
	}

	public int getOvertime(){
		return overtime;
	}
}


class Overtime{
	private Employee[] e;
	public Overtime(Employee[] e){
		
		this.e = e;
	}
	

	
	public void calOvertime(){
		int sum = 0;
		for(Employee i : e){
			sum = sum + i.getOvertime();
		}
		System.out.println("Total overtime work of all emp: " + sum + " hours.");
	}
}

class EmpApp{
	public static void main(String[] x){
		System.out.println("Since emp can work 40 hour a week.(i.e 5 days a week) therefore in month he is allowed to work 160 hour. if work day exceeds 20 it'll considered as overtime.");
		
		Employee e1 = new Employee(1, "Ram", 162);
		Employee e2 = new Employee(3, "Shyam", 166);
		Employee e3 = new Employee(4, "GhanShyam", 161);
		Employee e4 = new Employee(5, "Ramu", 155);
		Employee e5 = new Employee(6, "Harish", 150);
		Employee[] e = {e1, e2, e3, e4, e5};
		
		for(int i = 0; i<e.length; i++){
			e[i].displayInfo();
		
		}
		Overtime o = new Overtime(e);
		o.calOvertime();
		
	}
}