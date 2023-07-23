package collection;

import java.util.LinkedList;
import java.util.TreeSet;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> studentNames=new LinkedList<>();

studentNames.add("Sudarshan");
studentNames.add("Ganesh");
studentNames.add("ganesh");
studentNames.add("Ganesh");
studentNames.add("vSDnesh");
studentNames.add("aSDnesh");

for(String str:studentNames) {
	System.out.println(str);
}

	}

}
