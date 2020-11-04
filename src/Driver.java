import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> people = new HashMap<String, Integer>();
		
		
		String[] names = {"John Adams", "Sally Paul", "John Paul"};
		int[] ages = {21, 22, 8};
		
		for (int i = 0; i < names.length; i++) {
			people.put(names[i], ages[i]);
		}
		
	
		Set<Entry<String, Integer>> mappings = people.entrySet();
		System.out.println("HashMap values: ");
		for(Entry<String, Integer> mapping : mappings) {
			System.out.println("Name: " + mapping.getKey() + ", Age: " + mapping.getValue());
		}
		
		TreeMap <String, Integer> people2 = new TreeMap<>(people);
		
		System.out.println("\nTreeMap values: ");
		Set<Entry<String, Integer>> mappings1 = people2.entrySet();
		for(Entry<String, Integer> mapping : mappings1) {
			System.out.println("Name: " + mapping.getKey() + ", Age: " + mapping.getValue());
		}
		
		System.out.println("\nHashMap is unsorted and TreeMap is Sorted");
	}

}
