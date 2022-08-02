package Task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String>a1=new LinkedList<String>();
a1.add("Red");
a1.add("Blue");
a1.add("Green");
a1.add("Yellow");
System.out.println("The Linked List"+a1);
List<String>list =new ArrayList<String>(a1);
for(String abc:list) {
	System.out.println(abc);
}
	}

}
