//Consider we have class name as Machine with field id,name,fuelType,machineNo,machineCapacity and Mark Machine as POJO class

class Machine{
	private int id;
	private String name;
	private String fuelType;
	private int machineNo;
	private int machineCapacity;
	
	
	public void setId(int id){ this.id = id; }
	public int getId(){ return id; }
	
	public void setName(String name){ this.name = name; }
	public String getName(){ return name; }
	
	public void setFuelType(String type){ this.fuelType = type; }
	public String getFuelType(){ return fuelType; }
	
	public void setMachineNo(int mno){ this.machineNo = mno; }
	public int getMachineNo(){ return machineNo; }
	
	public void setMachineCapacity(int cap){ this.machineCapacity = cap; }
	public int getMachineCapacity(){ return machineCapacity; }
}