package Java.programs;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q08_HowToFindSmallestNumberInAnArray 
{
	
	int[] givenArray = {10,5,3,1,6,2,8};
	
	
	//Method:1
	public void usingNormalForLoop() 
	{
		int smallest = Integer.MAX_VALUE;
		
		for(int small:givenArray) 
		{
			
			if(small<smallest) 
			{
				smallest=small;
			}
		}
		System.out.println(smallest);
		
	}
	
	//Method:2
	public void usingArrays()
	{
		Arrays.sort(givenArray);
		System.out.println(givenArray[0]);
	}
	
	public void usingCollection()
	{
		//For using Collection Method we have convert the int [] to Integer []
		Integer given[] = {10,5,3,7,6,2,8};
		List<Integer> al = Arrays.asList(given);
		System.out.println(Collections.min(al));
		
	}
	public static void main (String[] args) 
		{
			Q08_HowToFindSmallestNumberInAnArray obj = new Q08_HowToFindSmallestNumberInAnArray();
			obj.usingNormalForLoop();	
			obj.usingArrays();
			obj.usingCollection();
		}
		
	}
	
	

