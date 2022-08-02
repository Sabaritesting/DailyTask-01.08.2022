package Task5;

import java.util.ArrayList;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>a1=new ArrayList<String>();
a1.add("Code Red");
a1.add("Code Blue");
a1.add("Code Yellow");
a1.add("Code Pink");
a1.add("Code Black");
System.out.println("Original ArrayList"+a1);
System.out.println("Checking the arraylist is empty or not"+a1.isEmpty());
a1.removeAll(a1);
System.out.println("Checking the arraylist is empty or not"+a1.isEmpty());
	}

}
