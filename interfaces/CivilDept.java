package interfaces;

public class CivilDept implements StrengthofDept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrengthofDept sod;
		
		sod=new CSEDept();
		sod.DeclareTotalNoOfStudents();
		
		sod=new CivilDept();
		sod.DeclareTotalNoOfStudents();
	}

	@Override
	public void DeclareTotalNoOfStudents() {
		// TODO Auto-generated method stub
		System.out.println(" Total no of students in Civil Dept are 59");
	}

}
