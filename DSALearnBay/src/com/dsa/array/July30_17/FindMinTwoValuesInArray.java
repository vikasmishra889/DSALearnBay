package com.dsa.array.July30_17;

public class FindMinTwoValuesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first = 9999999;
		int second = 99999999;
		int arr[] = {10,3,4,5,1}; // output should be 1 and 3
		
		for(int i=0; i <5;i++){
			if(first > arr[i]){
				second = first;
				first = arr[i];
			} else if(second > arr[i] && arr[i] != first){
				second = arr[i];
			}
		}

		System.out.println("first "+first);
		System.out.println("second "+second);
	}

}
