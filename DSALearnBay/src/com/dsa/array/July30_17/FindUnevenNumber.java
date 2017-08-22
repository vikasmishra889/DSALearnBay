package com.dsa.array.July30_17;

public class FindUnevenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,1,2,2,3,3,7,11,7,8,8,9,9}; // output should be 11
		int length = a.length; // lenght is 3
		System.out.println("--"+findMissingNumber(a,length+1));
		
	}
	
	private static int findMissingNumber(int arr[], int n){
		
		int xor = arr[0];
		for(int i=1;i<n-1; i++){
			System.out.print(" "+xor);
			xor = xor ^ arr[i];
			System.out.print(" "+xor);
		}
		
		
		return xor;
	}



}
