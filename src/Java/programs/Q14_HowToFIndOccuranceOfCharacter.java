package Java.programs;

import java.util.HashMap;
import java.util.Map;

public class Q14_HowToFIndOccuranceOfCharacter {

	public static void main(String[] args) {
		String given = "How to find occurance of character in a given string";
		String[] ch = given.split("");
		
		Map <String,Integer> m = new HashMap<String,Integer>();
		
		for (int i =0; i<ch.length; i++) {
			if(m.containsKey(ch[i])) {
				m.put(ch[i],m.get(ch[i])+1);
			}
			else {
				m.put(ch[i],1);
			}
		}
		System.out.println(m.entrySet());
	}

}
