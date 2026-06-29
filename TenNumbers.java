//Write a java program to accept 10 numbers from a user (using a while loop) and display the sum, average and product of the 10 numbers 

import java.util.Scanner;

public class TenNumbers{
	public static void main(String[] args) {
		
		int i = 1;
		int Sum = 0;
		int Average = 0;
		int Product = 1;
		int num; 
		int average = 0;
		Scanner scan = new Scanner(System.in);
		while (i <= 10){
			
			
			
		
			System.out.printf("Please Enter Number %d: ", i);
			//i = num; 
			num = scan.nextInt();
			Sum += num;
			Product *= num;
			
			
			i++;
			
		}
		
		average = Sum/10;
			
		System.out.printf("The sum of the numbers are %d%n", Sum);
		System.out.printf("The Products of the numbers is %d%n", Product);
		System.out.printf("The Average of the numbers is %d%n", average);
	}
}
			