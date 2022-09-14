package Java.programs;

public class Q09_HowToFindANumberPrimeOrNot {
	
	
	
	public static void main (String[] args) {
		
		int given = 9;
		
		int total=0;
for(int j = 0; j<=100; j++) 
{
			int count = 0;
	if(j>1) 
		{
			for(int i=1; i<=j; i++) 
			{
				if(j%i==0) 
				{
				count++;
				}			
			}
				if(count==2) 
				{
					total++;
					System.out.print(j+" ");
				}
	}
	
}
		System.out.println();
		System.out.println("Total Prime Numbers = " +total);
	}
}
