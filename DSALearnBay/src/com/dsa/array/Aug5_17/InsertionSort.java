package com.dsa.array.Aug5_17;

public class InsertionSort {

	public static void main(String[] args) {
		
		int arr[] = {5,4,3,2,1};
		for(int i = 0;i<arr.length; i++){
			int elem = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]> elem){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = elem;
		}

		for(int i =0;i<5;i++){
			System.out.print(" "+arr[i]);
		}
	}

}
