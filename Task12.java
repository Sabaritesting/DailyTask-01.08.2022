package Task5;

import java.util.LinkedList;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String>l_list=new LinkedList<String>();
l_list.add("Red");
l_list.add("Blue");
l_list.add("Green");
l_list.add("Yellow");
System.out.println("Original ArrayList"+l_list);
l_list.add(1,"White");
System.out.println("Modified ArrayList"+l_list);
	}

}
