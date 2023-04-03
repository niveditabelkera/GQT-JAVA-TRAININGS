
	package com.gqt.arraysproj;

	import java.util.Scanner;

	public class ArrayCode9 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the count of universities:");
	        int universityCount = sc.nextInt();
	        int universities[][][][] = new int[universityCount][][][]; // four-dimensional jagged array

	        // TAKING THE COUNT OF COLLEGES
	        for (int i = 0; i < universities.length; i++) {
	            System.out.println("Enter the count of the colleges inside the university " + (i + 1) + ":");
	            universities[i] = new int[sc.nextInt()][][];
	        }

	        // TAKING THE COUNT OF CLASSROOMS
	        for (int i = 0; i < universities.length; i++) {
	            System.out.println("Inside the university " + (i + 1) + ":");
	            for (int j = 0; j < universities[i].length; j++) {
	                System.out.println("Enter the count of classrooms inside the college " + (j + 1) + ":");
	                universities[i][j] = new int[sc.nextInt()][];
	            }
	        }

	        // TAKING THE COUNT OF STUDENTS
	        for (int i = 0; i < universities.length; i++) {
	            System.out.println("Inside the university " + (i + 1) + ":");
	            for (int j = 0; j < universities[i].length; j++) {
	                System.out.println("Inside the college " + (j + 1) + ":");
	                for (int k = 0; k < universities[i][j].length; k++) {
	                    System.out.println("Enter the count of students in classroom " + (k + 1) + ":");
	                    universities[i][j][k] = new int[sc.nextInt()];
	                }
	            }
	        }

	        // STORING THE CAPACITY OF THE STUDENTS
	        for (int i = 0; i < universities.length; i++) {
	            System.out.println("Inside the university " + (i + 1) + ":");
	            for (int j = 0; j < universities[i].length; j++) {
	                System.out.println("Inside the college " + (j + 1) + ":");
	                for (int k = 0; k < universities[i][j].length; k++) {
	                    System.out.println("Inside the classroom " + (k + 1) + ":");
	                    for (int l = 0; l < universities[i][j][k].length; l++) {
	                        String[][][][] university = null;
							System.out.println("Enter the capacity of student:  "+(l + 1)+ ":");
	                        universities[i][j][k][l] = sc.nextInt();
	                    }
	                }
	            }
	        }
	    
	        for(int i=0;i<universities.length;i++) {
				System.out.println("Inside the university: "+(i+1));
				for(int j=0;j<universities[i].length;j++) {
					System.out.println("inside the clg: "+(j+1));
					for(int k=0;k<universities[i][j].length;k++) {
						System.out.println(" inside the class room: "+(k+1));
						for(int l=0;l<universities[i][j][k].length;l++) {
							System.out.println("the capacity of the student no: "+(l+1)+" is: "+universities[i][j][k][l]);
}
	    }
	}
	        }
	    }
	}
	
	
