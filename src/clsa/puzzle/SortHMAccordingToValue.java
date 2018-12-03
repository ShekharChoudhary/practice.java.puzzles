package clsa.puzzle;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Sort a hashmap according to value.
 * @author choudshe
 *
 */
public class SortHMAccordingToValue {

	private  static HashMap<String,Integer> sortMapByValue(HashMap<String,Integer> map){
	
		List<Map.Entry<String,Integer>>  list = new LinkedList<Map.Entry<String,Integer>>(map.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		HashMap<String,Integer> newMap = new LinkedHashMap<>();
		for (Entry<String, Integer> entry : list) {
			newMap.put(entry.getKey(), entry.getValue());
		}
		
		return newMap;
	}
	
	
	public static void main(String[] args) {
		HashMap<String,Integer> m1 = new HashMap<>();
		m1.put("Maths", 96);
		m1.put("Physics", 90);
		m1.put("Chemistry", 70);
		m1.put("Biology", 45);
		m1.put("English",80);
		Map<String,Integer> m2 = sortMapByValue(m1);

		
		for (Entry<String,Integer> value : m2.entrySet()) {
			System.out.println(value);
		}
		
	}
}
