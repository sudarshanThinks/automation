package methodoverriding;

public class Civil extends StrenthOfDept  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 StrenthOfDept sd;
		 
		 sd=new CSE();
		 sd.TotalNoOfStudents();
		 
		 sd=new Civil();
		 sd.TotalNoOfStudents();
	}
		
		
		



	@Override
	public void TotalNoOfStudents() {
		// TODO Auto-generated method stub
		System.out.println("Total no. of students in Civil are 59 ");
	}
}
