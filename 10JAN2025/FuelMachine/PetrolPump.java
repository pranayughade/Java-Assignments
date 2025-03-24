import java.util.*;
class PetrolPump
{  
	Machine m[];
	
	
	void getCapacity(){
		System.out.println("Mchn Name" + "\t" + "FCapacity");
		System.out.println("------------------------------------");
		for(Machine n : m){
			System.out.println(n.getName() + "\t\t" + n.getMachineCapacity());
		}
		
	}
	
    PetrolPump(){
      this(5);
    }
    
	PetrolPump(int capacity)
	{  
		Scanner sc = new Scanner(System.in);
		// create object of machine class
		Machine[] arr = new Machine[capacity];
		System.out.println("Enter machine details of " + capacity+ " machines on PP: ");
		for(int i = 0; i<arr.length; i++){
			arr[i] = new Machine();
			
			System.out.print("Enter id: ");
			int mid = sc.nextInt(); sc.nextLine();
			
			System.out.print("Enter name: ");
			String mname = sc.nextLine();
			
			System.out.print("Enter fuel type: ");
			String ftype = sc.nextLine();
			
			System.out.print("Enter machine no.: ");
			int mno = sc.nextInt();
			
			System.out.print("Enter machine capacity : ");
			int mcap = sc.nextInt();
			
			
			System.out.println();
			arr[i].setId(mid);
			arr[i].setName(mname);
			arr[i].setFuelType(ftype);
			arr[i].setMachineNo(mno);
			arr[i].setMachineCapacity(mcap);
			
		} m = arr;
		
	}
	
	int getMachineCount(){
		int count = 0;
		for(int i = 0; i<m.length; i++){
			if(m[i]!= null){ 
				count++; 
			}
		}
		return count;
	} 
	
	
	
	Machine[] getMachineByFuelType(String fuelType){
		
		//this method can return machines according to fuel type
		
		Machine[] res = new Machine[m.length];        //[1000, 1004, 1008, 1012]
														//null    null  null  nulll
														//{ m1    m4    null  null}
		int index = 0;//1
		
		for(int i = 0; i<res.length; i++){
			if(m[i].getFuelType().equals(fuelType)){ !m2, m3    //m4
				res[index++] = m[i];
			}
		}
		return res;
	}
}
m1, m2, m3, m4, m5
m1, m4 = petrol
m3, m2 = electric