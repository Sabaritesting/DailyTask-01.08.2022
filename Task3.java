package Task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>list_String=new ArrayList<String>();
list_String.add("Figma");
list_String.add("Illustrator");
list_String.add("Photoshop");
list_String.add("Game");
list_String.add("Landing");
System.out.println("List Before sotrting"+list_String);
Collections.sort(list_String);
System.out.println("List After sorting"+list_String);
	}

}
