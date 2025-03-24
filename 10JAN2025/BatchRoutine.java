//Q1. WAP to create class name as Student with field id,name,email,contact and attendancePer and acadamicPer student as POJO //class 
//And you have to create class name as Batch with following constructor 
import java.util.*;


//You have to create one utility class name as BatchRouting like as 
class BatchRoutine{
	
    private BatchRoutine(){}

    static void showAllStudents(Batch batch){
		Student[] arr = batch.s;
	
		for(int i = 0; i<arr.length; i++){
			System.out.println(arr[i].getId() + "\t" + arr[i].getName() + "\t" + arr[i].getEmail() + "\t" + arr[i].getContact() + "\t" + arr[i].getAttendence() + "\t" + arr[i].getAcademic());
		}
	}
   
   
	static Student getTopper(Batch batch){
		Student[] st = batch.s;
		Student topper = st[0];
		for(int i = 0; i<st.length; i++){
			if(topper.getAcademic()< st[i].getAcademic()){
				topper = st[i];
			}
		}
	
		return topper;
	}
  
	static Student [] getIrregular(Batch b){
		Student[] arr = b.s;
		Student[] res = new Student[arr.length];
		int index = 0;
		for(int i = 0; i<arr.length; i++){
			if(arr[i].getAttendence() < 65){
				res[index++] = arr[i]; 
			}
		}
		return res;
	}
   
	static Student [] getConsistentStudent(Batch b){
		Student[] arr = b.s;
		Student[] res = new Student[arr.length];
		int index = 0;
		for(int i = 0; i<arr.length; i++){
			if(arr[i].getAttendence() >= 65){
				res[index++] = arr[i]; 
			}
		}
		return res;
	}
 
	 static Student[] getSameMarksStudent(Batch b) {
        Student[] st = b.s;                                          // s=10000>>>>st
		
		Student[] res = new Student[st.length]; //resultant to be retu
		int[] count = new int[st.length]; 
		
		
		for(int i = 0; i<count.length; i++){ 
			count[i] = 0; 
		
		}
		
		
		for (int i = 0; i < st.length; i++) {                                                   
			for (int j = i + 1; j < st.length; j++) {
			// Compare marks of student i and student j
					if (st[i].getAcademic() == st[j].getAcademic()) {
						count[i]++; 
						count[j]++; 
					}
				}
		}
		
		int index = 0;
		for(int i = 0; i<res.length; i++){
			if(count[i]>0){
				res[index++] = st[i];
				
			}
		}
		return res;
		
		
       
    }
}	

	