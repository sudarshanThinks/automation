package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, String> studNames=new HashMap<>();

studNames.put(2, "amol");
studNames.put(3, "akshay");
studNames.put(4, "shankar");
studNames.put(5, "ankush");
studNames.put(6, "sudarshan");
studNames.put(7, "ayush");
studNames.put(1, "Aditi");

for(Entry<Integer, String> hm: studNames.entrySet())
{
	System.out.println(hm.getKey()+":"+hm.getValue());
}

	}

}
