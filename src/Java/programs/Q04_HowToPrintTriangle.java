package Java.programs;

public class Q04_HowToPrintTriangle {
	
	int no_of_rows = 3;
	
	private void printStarTriangle() {
		for(int row=0; row<no_of_rows;row++) {
			for(int column=0; column<=row;column++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	private void printNumberTriangle() {
		int startNum=1;
		for(int row =0; row<no_of_rows; row++) {
			for(int column=0; column<=row; column++) {
				System.out.print(startNum+" ");
//				startNum++;    //for 1, 2 3 ,4 5 6 printing 
			}
//			startNum++;   // for 1,22,333 printing
			System.out.println();
		}
	}
	
	private void printUpsideTriangle() {
		int start = 1;
		for(int row = 0; row<no_of_rows;row++) {
			for(int column=no_of_rows;column>row;column--) {
				System.out.print(start+" ");
			}
			System.out.println();
		}
	}
	
	public static void main (String[] args) {
		Q04_HowToPrintTriangle triangle = new Q04_HowToPrintTriangle();
//		triangle.printStarTriangle();
//		triangle.printNumberTriangle();
		triangle.printUpsideTriangle();
	}

}
