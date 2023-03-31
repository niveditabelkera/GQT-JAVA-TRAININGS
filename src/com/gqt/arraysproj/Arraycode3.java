package com.gqt.arraysproj;

import java.util.Scanner;

public class Arraycode3 {
	//program for the three dimentional array concept

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of school:");
		int sch=sc.nextInt();
		System.out.println("Enter the count of the class:");
		int cls=sc.nextInt();
		System.out.println("Enter the count of the students:");
		int stu=sc.nextInt();
		int arr[][][]=new int[sch][cls][stu];//three dimentional array
		//storing the marks
		for(int i=0;i<sch;i++) {
			System.out.println("Inside the school: "+(i+1));
			for(int j=0;j<cls;j++) {
				System.out.println("Inside the class: "+(j+1));
				for(int k=0;k<stu;k++) {
					System.out.println("Enter the marks of the student no:  "+(k+1));
				arr[i][j][k]=sc.nextInt();
			}
		}
		}
		//fetching the marks
		for(int i=0;i<sch;i++) {
			System.out.println("Inside the school :"+(i+1));
			for(int j=0;j<cls;j++) {
				System.out.println("Inside the class: "+(j+1));
				for(int k=0;k<stu;k++) {

				System.out.println("enter the marks of the student no: "+(k+1)+" is :"+arr[i][j][k]);

			}
		}
	}
}


	}

