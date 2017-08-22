package com.dsa.array.Aug5_17;


//Use bit wis operator
public class FindMissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,3,4}; // output should be 2
		int length = a.length; // lenght is 3
		System.out.println(findMissingNumber(a,length));
	}
	
	private static int findMissingNumber(int arr[], int n){
		
		// XOR of all elements in the array - {1,2,4}
		int xor = arr[0];
		for(int i=1;i<n-1; i++){
			xor = xor ^ arr[i];
		}
		
		// XOR over the range {1,2,3,4}
		int xor1 = 1;
		for(int i=2;i<=n; i++){
			xor1 = xor1 ^ i;
		}
		
		return (xor ^ xor1);
	}

}
