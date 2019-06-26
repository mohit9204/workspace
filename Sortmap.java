import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sortmap {
public static void main(String[] args) {
	Map<String,Integer> mapvalues= new HashMap<>();
	mapvalues.put("mohit",2);
	mapvalues.put("Raj", 7);
	mapvalues.put("roshan",9);
	 
	 Map<String, Integer> result=mapvalues.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
	.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldvalue,newVlaue)->oldvalue,LinkedHashMap::new));
	 
	 System.out.println("Map Values after sorting "+result);
	 
	 
	 Map<Object,Object> mapvalues2= new HashMap<>();
		mapvalues.put("mohit",2);
		mapvalues.put("Raj", 7);
		mapvalues.put("roshan",9);
		 
		 Map<String, Integer> result2=mapvalues.entrySet().stream().collect(Collectors.toMap(k->(String)k.getKey(), v->(Integer)v.getValue()))
				 .entrySet().stream()
				 .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldvalue,newVlaue)->oldvalue,LinkedHashMap::new));
		 
		 System.out.println("Map Values after sorting "+result);
}
}
