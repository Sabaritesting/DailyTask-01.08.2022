package Task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>list_String=new ArrayList<String>();
list_String.add("King");
list_String.add("Queen");
list_String.add("minister");
list_String.add(" Chief Commander");
list_String.add("people");
System.out.println("List before reversing"+list_String);
Collections.reverse(list_String);
System.out.println("List after reversing"+list_String);
	}

}
