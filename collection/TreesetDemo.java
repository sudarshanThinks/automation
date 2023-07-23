package collection;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> studentNames=new TreeSet<>();
studentNames.add("Z");
studentNames.add("B");
studentNames.add("a");
studentNames.add("C");
studentNames.add("C");

for(String str:studentNames) {
	System.out.println(str);
}
	}
}


