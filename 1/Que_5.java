package assignment_1;
//5  Write a function that takes an array of integers and returns both the maximum and minimum values using a loop.
//Print the results in the main program.
public class Que_5 {
	void minMax_function(int array[]) {
		int min=array[0];
		int max=array[0];
		for(int i=0;i<array.length;i++) {
			if(min>array[i]) {
				min=array[i];
			}
			if(max<array[i]) {
				max=array[i];
			}
		}
		System.out.println("The minimum and maximum values of given array: "+min+","+max);
	}
	public static void main(String[] args) {
		try {
			int arr[]= {1,5,22,2,3,55,-1,76};
			Que_5 a1=new Que_5();
			a1.minMax_function(arr);
		}
		catch(Exception e) {System.out.println("Error: "+e);}
		
	}
}
