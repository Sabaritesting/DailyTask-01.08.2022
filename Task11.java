package Task5;

import java.util.ArrayList;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>a1=new ArrayList<String>();
a1.add("Red");
a1.add("Blue");
a1.add("Green");
System.out.println("Original ArrayList"+a1);
a1.ensureCapacity(6);
a1.add("Yellow");
a1.add("Black");
a1.add("White");
System.out.println("Modified ArrayList"+a1);
	}

}
