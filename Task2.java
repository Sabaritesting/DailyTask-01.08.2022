package Task5;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>list_String=new ArrayList<String>();
list_String.add("Resistor");
list_String.add("Capacitor");
list_String.add("Inductor");
for(String RLC:list_String) {
	System.out.println(RLC);
	list_String.add(0, "Pink");
	  list_String.add(5, "Yellow");
	  // Print the list
	  System.out.println(list_String);
	 }
}
	}


