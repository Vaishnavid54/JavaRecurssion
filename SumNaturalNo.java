package com.recursion.easy;

public class SumNaturalNo {
	//Print sum of first n natural number
	public static void printSum(int i, int n, int sum) {
		if(i==n) {
			sum+=i;
			System.out.println("Sum of n natural number: " + sum);  // base condition
			return;
		}
		sum+=i;
		printSum(i+1,n,sum);
		System.out.println(i); //prints 4 3 2 1
	}
	public static void main(String[] args) {
		printSum(1,5,0);
	}
}
