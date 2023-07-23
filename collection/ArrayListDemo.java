package collection;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> studentNames=new ArrayList<>();

studentNames.add("Amol");
studentNames.add("Akshay");
studentNames.add("ankush");
studentNames.add("Ayush");
studentNames.add("shubham");
studentNames.add("sony");
studentNames.add("rohini");
studentNames.add("vrushali");
studentNames.add("aa");
studentNames.add("bb");
//studentNames.get(7);
	
System.out.println(studentNames.remove(9));


//System.out.println(studentNames);
for(String str:studentNames) {
	System.out.println(str);
}

}
}

