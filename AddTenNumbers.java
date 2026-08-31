//Write a java method that will calculate the sum of 10 numbers (USE SCANNER AND LOOP)

import java.util.Scanner;


public class AddTenNumbers{
	public static void main(String[] args){
		
	
		int result = addTen();
		
			System.out.println("The Sum of all 10 numbers is " + result); 
		
	
		

	}
	
	public static int addTen(){
		
		//int sum = num1 + num2 + num3 + num4 + num5+ num6+ num7+ num8+ num9+ num10;
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int counter = 1 ;
		
		while (counter <= 10) {
		System.out.print("Enter Number " + counter + ": ");
			int num = scan.nextInt();
			 sum += num;
			counter++;
	}
		
		return sum;
		
		
	
		
		
	}
}