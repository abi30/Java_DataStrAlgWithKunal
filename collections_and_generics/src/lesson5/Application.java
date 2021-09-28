package lesson5;

import java.util.Map;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {
		
		
		TreeMap <String,String>dictionary = new TreeMap<String ,String>();
		dictionary.put("Brave", "without fear of danger");
		dictionary.put("Brilliant", "having or showing great intelligence");
		dictionary.put("Joy", "great happiness");
		dictionary.put("Rich", "having a lot of money");
		dictionary.put("Confidence", "trust or belief in someone’s ability");

		
		
//		for(String word :dictionary.keySet()) {
//				System.out.println(word+": " +dictionary.get(word));
//		}
		
		for (Map.Entry<String, String> entry: dictionary.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
