package Java.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Q05_HoToReverseWord {
	
	String given="Welcome To Java";
	String rev="";
	public  void usingForLoop() {
		String[] split = given.split(" ");
		for(int i = split.length-1; i >=0; i--) {
			rev=rev+split[i]+" ";
		}
		System.out.println(rev);
	}
	
	public void usingCollection() {
		String[] split = given.split(" ");
		List al = new ArrayList();
		for(String word : split) {
			al.add(word);
		}
		Collections.reverse(al);
		ListIterator list =al.listIterator();
		while(list.hasNext()) {
			System.out.print(list.next()+" ");
		}
	}
	
	
	public static void main (String[] args) {
		Q05_HoToReverseWord word = new Q05_HoToReverseWord();
		word.usingForLoop();
		word.usingCollection();
		
	}
	
	
	

}
