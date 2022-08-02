package Task5;

import java.util.LinkedList;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> a1 = new LinkedList <String> ();
a1.add("Red");
a1.add("Blue");
a1.add("Green");
a1.add("Yellow");
System.out.println("Original ArrayList"+a1);
LinkedList<String>a2=new LinkedList <String>();
a2.add("Black");
a2.add("White");
a2.add("Grey");
a2.add("Peach");
System.out.println("Second ArrayList"+a2);
LinkedList<String>a=new LinkedList<String>();
a.addAll(a1);
a.addAll(a2);
System.out.println("Modified ArrayList"+a);
	}

}
