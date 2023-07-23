package constructorChaining;//This is not constructorChaining

public class GrandchildClass {
	int aaa,bbb;
	
	public void calculate(int aa, int bb) {
		aaa=aa;
		bbb=bb;
		int cc=aaa+bbb;
		System.out.println("Addition  is:"+cc);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 GrandchildClass gc=new GrandchildClass();
		// gc.show();
		 gc.calculate(10, 15);
		 
	}

}
