package Java.programs;

public class Q15_HowToRemoveSpecialCharactrers {

	public static void main(String[] args) {
		String given = "!@##%&#()#String to Remove The Special Characters132465465";
		int l1=given.length();
		String after = given.replaceAll("[^0-9a-zA-Z]", "");
		int l2=after.length();
		System.out.println(after);
		System.out.println(l1-l2);
	}

}
