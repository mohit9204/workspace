import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.ls.LSInput;

public class DublicateList {
public static void main(String[] args) {
	List<String> listValues= new ArrayList<>();
	listValues.add("mohit");
	listValues.add("raj");
	listValues.add("roshan");
	listValues.add("raj");
for (int i = 0; i < listValues.size(); i++) {
	for (int j = i+1; j < listValues.size(); j++) {
		if(listValues.get(i).equals(listValues.get(j))){
			listValues.remove(j);
			j--;
		}
		
	}
}	
System.out.println("ArrayList after dublicate removal "+listValues);
}
}
