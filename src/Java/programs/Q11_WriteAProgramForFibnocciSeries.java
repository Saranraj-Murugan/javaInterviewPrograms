package Java.programs;

public class Q11_WriteAProgramForFibnocciSeries {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int sum;
		
		int limit = 10;
		
		for(int i=1;i<=limit;i++) {
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.print(sum+" ");
		}
	}

}
