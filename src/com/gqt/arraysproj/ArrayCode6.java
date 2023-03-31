package com.gqt.arraysproj;

import java.util.Scanner;

public class ArrayCode6 {
	/* i(school)   j(class)   k(students)
	 *   0             0          2
	 *                 1          3
	 *   1             0          3
	 *                 1          4
	 *                 2          5              
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//three dimentional jagged array
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of schools:");
		int sch=sc.nextInt();
		//System.out.println("Enter the count of students:");
		//int stu=sc.nextInt();
		int arr[][][]=new int[sch][][];//three dimentional jagged array
		//storing the marks
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the count of the classes inside the school"+(i+1));
			arr[i]=new int[sc.nextInt()][];
		}
		//taking student count
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the school "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the count of students inside the class no:  "+(j+1));
				arr[i][j]=new int[sc.nextInt()];
			}
		}

	////storing the marks 
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the school :"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside the class: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the marks of the student number: "+(j+1));
					arr[i][j][k]=sc.nextInt();
				}
			}
		}
		//fetching rhe marks
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the school :"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside the class: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the marks of the student number: "+(k+1)+" is:"+arr[i][j][k]);
				}
			}
		}
	}
}


