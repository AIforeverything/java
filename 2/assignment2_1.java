//1 wap to take 10 numbers in an array and print count of even and odd number in given array.
package com.Assignments;

public class assignment2_1 {
	int arr[]= {1,2,3,4,5,6,7,8,9,10};
	int evenNumbers=0;
	int oddNumbers=0;
	
	void count_even() {
		for(int x:arr) {
			if(x%2==0) {
				evenNumbers+=1;
			}
		}
		System.out.println("Count of Even Numbers: "+evenNumbers);	
	}
	
	void count_odd() {
		for(int x:arr) {
			if(x%2!=0) {
				oddNumbers+=1;
			}
		}
		System.out.println("Count of Even Numbers: "+oddNumbers);	
		
	}

	public static void main(String[] args) {
		assignment2_1 a12=new assignment2_1();
		a12.count_even();
		a12.count_odd();
	}

}
