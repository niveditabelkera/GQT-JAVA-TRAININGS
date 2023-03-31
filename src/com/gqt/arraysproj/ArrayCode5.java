package com.gqt.arraysproj;

import java.util.Scanner;

public class ArrayCode5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*two dimentional jagged array
		 * i(classes)   j(students)
		 * 0           3
		 * 1           4
		 * 2           5
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of classes:");
		int cls=sc.nextInt();
		//System.out.println("Enter the count of students:");
		//int stu=sc.nextInt();
		int arr[][]=new int[cls][];//two dimentional jagged array
		//storing the marks
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the count of the student inside the class "+(i+1));
			arr[i]=new int[sc.nextInt()];
		}
		//storing the marks
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the class "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the marks of the student no:  "+(j+1));
				arr[i][j]=sc.nextInt();
			}
		}

	//fetching the marks
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the class :"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("The marks of the student no: "+(j+1)+" is :"+arr[i][j]);
			}
			}
	}
}


