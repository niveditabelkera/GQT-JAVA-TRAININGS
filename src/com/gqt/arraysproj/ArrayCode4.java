package com.gqt.arraysproj;

import java.util.Scanner;

public class ArrayCode4 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//four dimentional array program
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the count of university:");
			int uni=sc.nextInt();
			System.out.println("Enter the count of school:");
			int sch=sc.nextInt();
			System.out.println("Enter the count of the class:");
			int cls=sc.nextInt();
			System.out.println("Enter the count of the students:");
			int stu=sc.nextInt();
			int arr[][][][]=new int[uni][sch][cls][stu];//three dimentional array
			//storing the marks
			for(int i=0;i<uni;i++) {
				System.out.println("Inside the university: "+(i+1));
						for(int j=0;j<sch;j++) {
			System.out.println("Inside the school: "+(j+1));
					for(int k=0;k<cls;k++) {
						System.out.println("inside the class:  "+(k+1));
						for(int l=0;l<stu;l++) {
							System.out.println("Enter the marks of the student:  "+(l+1));
						arr[i][j][k][l]=sc.nextInt();
				}
			}
			}
			}
			//fetching the marks
			for(int i=0;i<uni;i++) {
				System.out.println("Inside the university :"+(i+1));
				for(int j=0;j<sch;j++) {
					System.out.println("Inside the school: "+(j+1));
					for(int k=0;k<cls;k++) {
						System.out.println("Inside the class: "+(k+1));
						for(int l=0;l<stu;l++) {
System.out.println("enter the marks of the student no: "+(l+1)+" is :"+arr[i][j][k][l]);

				}
			}
		}
	}


		}



	}

