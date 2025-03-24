class MatchinPetrolApp{
	public static void main(String[] x){
		PetrolPump p = new PetrolPump();
		
		
		System.out.println("Total machines on petrol pump are : " + p.getMachineCount());
		
		System.out.println();
		
		p.getCapacity();
		
		System.out.println();
		
		Machine[] m = p.getMachineByFuelType("Petrol");
		System.out.println("MAchines on petrol pump with fuel type petrol: ");
		System.out.println("ID" + "\t\t" + "NAME" + "\t\t" + "FUELTYPE" + "\t\t" + "MNumb" + "\t\t" + "MCap");
		System.out.println("-----------------------------------------------------------------------------------");
		for(int i = 0; i<m.length; i++){  
			if(m[i]!=null){ 
				System.out.println(m[i].getId() + "\t\t" + m[i].getName() + "\t\t" + m[i].getFuelType() + "\t\t" + m[i].getMachineNo() + "\t\t" + m[i].getMachineCapacity());
			}
		}
		
		System.out.println();
		
		Machine[] n = p.getMachineByFuelType("Electric");
		System.out.println("MAchines on petrol pump with fuel type electric: ");
		System.out.println("ID" + "\t\t" + "NAME" + "\t\t" + "FUELTYPE" + "\t\t" + "MNumb" + "\t\t" + "MCap");
		System.out.println("-----------------------------------------------------------------------------------");
		for(int i = 0; i<n.length; i++){
			if(n[i]!= null){
				System.out.println(n[i].getId() + "\t\t" + n[i].getName() + "\t\t" + n[i].getFuelType() + "\t\t" + n[i].getMachineNo() + "\t\t" + n[i].getMachineCapacity());
			}
		}
	}
}