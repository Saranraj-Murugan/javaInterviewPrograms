package Java.programs;

public class Q10_HowToFindANumberIsAmstrongOrNot {

	public static void main(String[] args) {
		
		int given = 153;
		int sum = 0;
		int rev;
		
		int actual = given;
		
		while(given!=0) {
		rev = given%10;     
		given = given/10; 
		sum = sum + rev*rev*rev; 
		}
		
		if(actual==sum) {
			System.out.println("Amstrong Number");
		}
		else {
			System.out.println("Not Amstrong Number");
		}
		
		
	}

}
