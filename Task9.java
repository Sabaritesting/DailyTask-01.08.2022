package Task5;

import java.util.Iterator;
import java.util.LinkedList;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String>l_list=new LinkedList<String>();
l_list.add("Red");
l_list.add("Blue");
l_list.add("Yellow");
l_list.add("Green");
Iterator a=l_listIterator(1);
while(a.hasNext()) {
	System.out.println(a.next());
}
	}

}
