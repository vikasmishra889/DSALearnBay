package com.dsa.array.July30_17;


//Number is power is of 2 or not
public class FindPowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkNumber(8));

	}
	
	private static boolean checkNumber(int n){
		
		if((n & (n-1))==0)
			return true;
		
		return false;
	}

}
