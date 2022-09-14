package Java.programs;

public class Q13_HowToCountNoOfWords {

	public static void main(String[] args) {
		String given = "How to find the number of words in a given String";
		String[] words = given.split(" ");
		int count=0;
		for(String word:words) {
			count++;
		}
		System.out.println(count);
	}

}
