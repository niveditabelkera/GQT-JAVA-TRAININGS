package com.gqt.arraysproj;

//public class GqtNarendra {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
import java.util.Scanner;

public class GqtNarendra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((j==0 && i!=0 && i!=(n-1)) || (i==0 && j!=0 && j<=n/2) ||
						(i==n/2 && j>n/4 && j<n/2) || (i==(n-1) && j>0 && j<=n/4) || (j==n/4 && i>n/2) ||
						(j==n/2 && i>n/2))
				{
					System.out.print("$  ");
				}
				else {
					System.out.print("   ");//Three spaces are required here
				}
			}
			//'Q'
			for(int j=0;j<n;j++) {
				if((j==0 && i!=0 && i!=(n-1))||(j==n/2 && i!=0 && i!=(n-1))||(i==0 && j<n/2 && j!=0 && j!=n/2)||(i==(n-1) && j<n/2 &&j!=0 && j!=n/2)||(i==j && i>2 && j>2 && i<(n-1) && j<(n-1) ))
					
				{
					System.out.print("$  ");
				}
				else {
					System.out.print("   ");//Three spaces are required here
				}
			}
			
			//'T'
			for(int j=0;j<n;j++) {
				if((i==0 && j<n/2) || j==n/4)
					
				{
					System.out.print("$  ");
				}
				else {
					System.out.print("   ");//Three spaces are required here
				}
			}
				//'N'
			for(int j=0;j<n;j++) {
				if(j==0 || (i-j==n/4 && j<=n/2) || j==(n/2))
					//if(j==0 || i==j || j==(n-1))

					
				{
					System.out.print("$  ");
				}
				else {
					System.out.print("   ");//Three spaces are required here
				}
			}
			
			//'A'
			for(int j=0;j<n;j++) {
				if(j==0 || (i==0 && j<=n/2) || (i==n/2 && j<=n/2) || j==n/2) 
						{
							System.out.print("$  ");
						}
						else {
							System.out.print("   ");
						}
					}
				
			//'R'
			for(int j=0;j<n;j++) {
				if(j==0||(i==n/2 && j<n/2)||(i==0 && j<n/2)||(j==n/2 && i!=0 && i!=n/2))// && j!=n/2)||(i==j && i>2 && j>2 && i<(n-1) && j<(n-1) ))
					
				{
					System.out.print("$  ");
				}
				else {
					System.out.print("   ");//Three spaces are required here
				}
			}
			
			//'E'
			for(int j=0;j<n;j++) {
				if(j==0 || (i==0 && j<=n/2) || (i==n/2 && j<=n/2)|| (i==(n-1) && j<=n/2))
							{
								System.out.print("$  ");
							}
							else {
								System.out.print("   ");//Three spaces are required here
							}
						}
			
			//'N'
			for(int j=0;j<n;j++) {
				if(j==0 || (i-j==n/4 && j<=n/2) || j==(n/2))
					//if(j==0 || i==j || j==(n-1))

					
				{
					System.out.print("$  ");
				}
				else {
					System.out.print("   ");//Three spaces are required here
				}
			}
			
			//'D'
			for(int j=0;j<n;j++) {

			if(j==0 || (i==0 && j<n/2) || (j==n/2 && i!=0 && i!=(n-1))
					|| (i==(n-1) && j!=0 && j<n/2)) 
			{
				System.out.print("$  ");
			}
			else {
				System.out.print("   ");//Three spaces are required here
			}
		}
		
		//'R'

		for(int j=0;j<n;j++) {
			if(j==0||(i==n/2 && j<n/2)||(i==0 && j<n/2)||(j==n/2 && i!=0 && i!=n/2))// && j!=n/2)||(i==j && i>2 && j>2 && i<(n-1) && j<(n-1) ))
				
			{
				System.out.print("$  ");
			}
			else {
				System.out.print("   ");//Three spaces are required here
			}
		}
		
		//'A'
		for(int j=0;j<n;j++) {
			if(j==0 || (i==0 && j<=n/2) || (i==n/2 && j<=n/2) || j==n/2) 
					{
						System.out.print("$  ");
					}
					else {
						System.out.print("   ");
					}
				}
		
		System.out.println();
		
		}
}
}
