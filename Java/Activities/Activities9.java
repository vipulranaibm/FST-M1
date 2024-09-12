package Activities;

import java.util.ArrayList;

public class Activities9 {
public static void main(String[] args) {
	ArrayList<String> myList = new ArrayList<String>();
	myList.add("Apple");
	myList.add("Mango");
	myList.addFirst("Banana");
	myList.addLast("Grapes");
	myList.add(3, "papaya");

	System.out.println("Print all the fruits:");
	for (String s:myList) {
		System.out.println(s);
	}
	
    System.out.println("3rd element in the list is: " + myList.get(2));
    System.out.println("Is Chicku is in list: " + myList.contains("Chicku"));
    System.out.println("Size of ArrayList: " + myList.size());
	
    myList.remove("papaya");
    
    System.out.println("New Size of ArrayList: " + myList.size());
}
}
