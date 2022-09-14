package Java.programs;

public class Q12_HowToCountDigitsInGivenNumber {

	public static void main(String[] args) {
		int given = 5456789;
		int count=0;
		while(given!=0) {
			count++;
			given=given/10;
		}
		System.out.println(count);
	}

}
