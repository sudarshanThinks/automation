package assignment;

public class UnitedStates extends UN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         UN un;
         un=new Bhutan();
         un.declarecapitalofnation();
         
         un=new India();
         un.declarecapitalofnation();
         
         un=new Shrilanka();
         un.declarecapitalofnation();
         
         un=new UnitedStates();
         un.declarecapitalofnation();
	}

	@Override
	public void declarecapitalofnation() {
		// TODO Auto-generated method stub
		System.out.println("Capital is Washington, D.C.");
	}

}
