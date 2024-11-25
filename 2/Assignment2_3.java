//3  WAP that add 10 to each element of array and print numbers that are smaller than 50.

package com.Assignments;


public class Assignment2_3 {
	
	void add10Toarray(int k[]) {
		
		for(int i=0;i<k.length;i++) {
			k[i]=k[i]+10;
		}
		System.out.print("Elements of array which are less than 50: ");
		for(int x:k) {
			if(x<50) {
		System.out.print(" "+ x);}
		}
	}

	public static void main(String[] args) {
		int arr[]= {6,7,8,99,40};
		Assignment2_3 a23= new Assignment2_3();
		a23.add10Toarray(arr);
	}
}
