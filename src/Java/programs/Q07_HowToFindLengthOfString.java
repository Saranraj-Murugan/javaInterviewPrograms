package Java.programs;

public class Q07_HowToFindLengthOfString {
	
	String given = "Welcome To Java";
	
	
	//Method:1
	public void usingLengthFunction() {
		System.out.println(given.length());
	}
	
	
	//Method:2
	public void withoutUsingLengthFunction() {
		int count =0;
		char[] ch = given.toCharArray();
		for(char c:ch) {
			count++;
		}
		System.out.println(count);
	}
	
	public static void main (String[] args) {
		Q07_HowToFindLengthOfString obj = new Q07_HowToFindLengthOfString();
		obj.usingLengthFunction();
		obj.withoutUsingLengthFunction();
	}
	

}
