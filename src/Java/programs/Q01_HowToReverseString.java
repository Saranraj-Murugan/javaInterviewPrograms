package Java.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Q01_HowToReverseString {

	
	String given = "Welcome to Automation";
	
	
	//Method1
	private void usingStringBuffer() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(given);
		System.out.println("Using String Buffer = "+buffer.reverse());	
	}
	//Method2
	private void usingStringBuilder() {
		StringBuilder builder = new StringBuilder();
		builder.append(given);
		System.out.println("Using String Builder = "+builder.reverse());
	}
	//Method3
	private void usingCollection() {
		List<Character> al = new ArrayList<Character>();
		char[] array = given.toCharArray();
		for(Character ch : array) {
			al.add(ch);
		}
		Collections.reverse(al);
		System.out.print("Using Collection = ");
		ListIterator list = al.listIterator();
		while(list.hasNext()) {
			System.out.print(list.next());
		}
	}
	//Method4
	private void usingForLoop() {
		String reversed = "";
		String[] st = given.split("");
		for(int i=st.length-1; i>=0; i--) {
			reversed=reversed+st[i];
		}
		System.out.println();
		System.out.println("Using For Loop = "+reversed);
	}
	
	public static void main(String[] args) {
		Q01_HowToReverseString string = new Q01_HowToReverseString();
		string.usingStringBuffer();
		string.usingStringBuilder();
		string.usingCollection();
		string.usingForLoop();
	}

}
