import java.util.*;
class Batch{
	
	Student s[];
	int  a = 2;
	
	
	Batch(){                                                              // Batch b = new Batch();   Batch(3) > Batch(3, 0)
		this(3);
	}
	
	Batch(int size) //10/16/20
	{  this(size,0);
	
	}
	
	Batch(int size,int extendCap){  
		Scanner sc = new Scanner(System.in);  
		Student[] arr = new Student[size + extendCap];
										
		System.out.println("Enter details of " + arr.length+ " students.");
		System.out.println(arr.length);
		for(int i = 0; i<arr.length; i++){
			arr[i] = new Student();
			
			
			System.out.print("Enter id: ");
			int sid = sc.nextInt(); sc.nextLine();
			
			System.out.print("Enter name: ");
			String sname = sc.nextLine();
			
			System.out.print("Enter email: ");
			String semail = sc.nextLine();
			
			System.out.print("Enter contact: ");
			long scontact = sc.nextLong();
			
			System.out.print("Enter attendence per : ");
			int sAtPer = sc.nextInt();
			
			System.out.print("Enter academic per : ");
			int sAcPer = sc.nextInt();
			System.out.println();
			arr[i].setId(sid);
			arr[i].setName(sname);
			arr[i].setEmail(semail);
			arr[i].setContact(scontact);
			arr[i].setAttendence(sAtPer);
			arr[i].setAcademic(sAcPer);
			
			
		}
		s=arr;
		
	}
}
