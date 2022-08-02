package Task5;

import java.util.ArrayList;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> a1=new ArrayList<String>();
a1.add("Black");
a1.add("Red");
a1.add("Yellow");
a1.add("Pink");
System.out.println("Original List"+a1);
System.out.println("Print using index of element");
int no_of_elements=a1.size();
for (int index = 0; index < no_of_elements; index++)
	   System.out.println(a1.get(index));
	}

}
