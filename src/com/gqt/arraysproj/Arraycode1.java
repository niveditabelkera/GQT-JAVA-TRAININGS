package com.gqt.arraysproj;

import java.util.Scanner;

public class Arraycode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of students:");
		int n=sc.nextInt();
		int arr[]=new int[n];//one dimentional array
		
		//storing the data
		for(int i=0;i<=(n-1);i++) {
			System.out.println("Enter the marks of the student no: "+(i+1));
			arr[i]=sc.nextInt();
		}
		System.out.println("######-----MARKS ADDED######");
		
		//FETCHING THE DATA
		for(int i=0;i<=(n-1);i++) {
			System.out.println("The marks of student no: "+(i+1)+" is = "+arr[i]);
		}
	}
}
