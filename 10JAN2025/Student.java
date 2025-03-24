class Student{
	private int id; 
	private String name;
	private String email;
	private long contact;
	private int attendencePer;
	private int acadmicPer;
	
	public void setId(int id){ this.id = id; }
	public int getId(){ return id; }
	
	public void setName(String name){ this.name = name; }
	public String getName(){ return name; }
	
	public void setEmail(String email){ this.email = email; }
	public String getEmail(){ return email; }
	
	public void setContact(long contact){ this.contact = contact; }
	public long getContact(){ return contact; }
	
	public void setAttendence(int att){ this.attendencePer = att; }
	public int getAttendence(){ return attendencePer; }
	
	public void setAcademic(int ac){ this.acadmicPer = ac; }
	public int getAcademic(){ return acadmicPer; }
	
}