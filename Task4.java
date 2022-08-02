package Task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list_String=new ArrayList<String>();
		list_String.add("Ferrai");
		list_String.add("BMW");
		list_String.add("Audi");
		list_String.add("Benz");
		System.out.println("List before Shuffle:"+list_String);
		Collections.shuffle(list_String);
		System.out.println("List after shuffle:"+list_String);
	}

}
