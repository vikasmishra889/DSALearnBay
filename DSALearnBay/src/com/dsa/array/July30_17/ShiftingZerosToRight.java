package com.dsa.array.July30_17;


// all the 0 elements shifted to the right, order of non zero elements should be same - contraint - no auxilary memory(temp variable), it should be O(1)
public class ShiftingZerosToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,0,4,5,0,6,0,8}; // output should be {2,4,5,6,8,0,0,0}
		int length = a.length; // lenght is 3
		int b[] = shiftTheZeros(a,length);
		for(int i=0;i<b.length; i++){
			System.out.print(b[i]+",");
		}
		
	}
	
	private static int[] shiftTheZeros(int arr[], int n){
		
		int count = 0;
		for(int i=0;i<n; i++){
			if(arr[i] != 0){
				arr[count++] = arr[i];
			}
		}
		
		while(count <n){
			arr[count++] = 0;
			
		}
		
		return arr;
	}



}
