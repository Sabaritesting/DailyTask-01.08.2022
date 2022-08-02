package Task5;

import java.util.Collections;
import java.util.LinkedList;

public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String>a1=new LinkedList<String>();
a1.add("Red");
a1.add("Blue");
a1.add("Green");
a1.add("Yellow");
a1.add("Black");
System.out.println("The Original Linked List"+a1);
Collections.swap(a1, 0, 2);
System.out.println("The Modified Linked List"+a1);
	}

}
