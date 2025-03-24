


class BatchApp{
	public static void main(String[] x){
		Batch b = new Batch();
		
		Student topper = BatchRoutine.getTopper(b);
		
		System.out.println("Students in batch : ");
		System.out.println("-----------------------------------------------");
		BatchRoutine.showAllStudents(b);
		
		System.out.println();
		
		System.out.println("Same Marks Students: ");
		System.out.println("-----------------------------------------------");
		Student[] sMark = BatchRoutine.getSameMarksStudent(b);
		for(int i = 0; i<sMark.length; i++){
			if(sMark[i] != null){
				System.out.println(sMark[i].getId() + "\t" + sMark[i].getName() + "\t" + sMark[i].getEmail() + "\t" + sMark[i].getContact() + "\t" + sMark[i].getAttendence() + "\t" + sMark[i].getAcademic());
			}
		}
		
		
		
		System.out.println("Regular Students: ");
		System.out.println("-----------------------------------------------");
		Student[] sRegular = BatchRoutine.getConsistentStudent(b);
		for(int i = 0; i<sRegular.length; i++){
			if(sRegular[i] != null){
				System.out.println(sRegular[i].getId() + "\t" + sRegular[i].getName() + "\t" + sRegular[i].getEmail() + "\t" + sRegular[i].getContact() + "\t" + sRegular[i].getAttendence() + "\t" + sRegular[i].getAcademic());
			}
		}
		System.out.println();
		
		
		System.out.println("Irregular Students: ");
		System.out.println("-----------------------------------------------");
		Student[] sIregular = BatchRoutine.getIrregular(b);
		for(int i = 0; i<sIregular.length; i++){
			if(sIregular[i] != null){
				System.out.println(sIregular[i].getId() + "\t" + sIregular[i].getName() + "\t" + sIregular[i].getEmail() + "\t" + sIregular[i].getContact() + "\t" + sIregular[i].getAttendence() + "\t" + sIregular[i].getAcademic());
			}
		}
		System.out.println();
		
	}
}
