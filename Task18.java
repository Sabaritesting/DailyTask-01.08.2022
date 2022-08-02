package Task5;

import java.util.Iterator;
import java.util.LinkedList;

public class Task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String>a1=new LinkedList<String>();
a1.add("Red");
a1.add("Blue");
a1.add("Green");
a1.add("Yellow");
System.out.println("riginal LinkedList"+a1);
Iterator it=a1.descendingIterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
	}

}
