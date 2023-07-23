package constructor;

public class ConstructorDemo {
	int studRolllNo;
	String studName;
	String studAddress;
	
	 ConstructorDemo(int sr,String sn, String sa){
	 studRolllNo=sr;
		 studName=sn;
		studAddress=sa;
	 }
	ConstructorDemo(){
		System.out.println("i am from the non parameterized constructor");
	}
	public void show()
	{
		System.out.println(studRolllNo);
		System.out.println(studName);
		System.out.println( studAddress);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConstructorDemo cd=new ConstructorDemo();
ConstructorDemo cd1=new ConstructorDemo(1,"jobito","pune");
ConstructorDemo cd2=new ConstructorDemo(2,"amol","pune");
ConstructorDemo cd3=new ConstructorDemo(3,"ankush","pune");
cd1.show();
cd2.show();
cd3.show();
	}

}
