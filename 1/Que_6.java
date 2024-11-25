package assignment_1;
//Q 6  Write a function that takes an  10 integer  and returns the sum of all even and odd numbers

import java.util.Scanner;
public class Que_6 {
	void sumEvenOdd_function(int array[]) {
		int sumEven=0;
		int sumOdd=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				sumEven+=array[i];
			}
			else {
				sumOdd+=array[i];
			}
		}
		System.out.println("Sum of even numbers and \n sum of odd mnumbers \n in the array are respectively :\n"+sumEven+" , "+sumOdd);
	}
	
	public static void main(String[] args) {
		try {
			int arr[]= {1,2,3,5,6,78,9,9,90,88};
			Que_6 a1=new Que_6();
			a1.sumEvenOdd_function(arr);
		}
		catch(Exception e) {System.out.println("Error: "+e); }	
	}

}
//
//package com.test2;
//
//public class Array1 {
// 
//	public static void main(String[] args) {
// 
//		int even=0;
//		int odd=0;
//		 int arr[]= {1,2,3,5,6,78,9,9,90};
//		
//		 for(int i=0;i<arr.length;i++)
//		 {
//			 if( arr[i]%2==0)
//				 even+=arr[i];
//			 else
//				 odd+=arr[i];
//		 }
//		 /*
//		 for()
//		 {
//			 int u=s.nextInt();
//			 if(u%2==0)
//			   sumeven+=u;
//			   else
//			   sumodd+=u;
//				 */
//		 }
// 
//	}
// 
//}
