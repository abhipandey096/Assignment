package Assignment1;

import java.util.Scanner;

public class question_2 {
	public static void main(String[] args){
		int numStudents;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Students:");
		numStudents=sc.nextInt();
		double sum=0;
		int grades[]= new int[numStudents];
		for(int i=0;i<numStudents;i++) {
			System.out.println("Enter the grade of student "+(i+1));
			n=sc.nextInt();
			while(n>100) {
				System.out.println("try again...");
				System.out.println("Enter the grade of student "+(i+1));
				n=sc.nextInt();
			}
			grades[i]=n;
			sum+=n;
			
		}
		System.out.println("The Average is:"+ sum/numStudents);
		
		sc.close();
		
		
	}
	
	
}
