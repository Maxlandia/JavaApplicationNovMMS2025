//Write a sentinel loop

import java.util.Scanner;


public class SentinelRepetitionLoop2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number;
		int positive = 0;
		int negative = 0;
		int zero = 0;
		
		
		while(true){
			System.out.println("Enter Number: ");
			number = input.nextInt();
			
			if(number == -1){
				break;
			}
		
			
			if(number > 0){
				positive++;
			}
			if(number<0){
				negative++;
			}
			else{
				zero++;
			}
			
		}
		System.out.printf("There are %d positive numbers, %d negative numbers, %d zeros", positive, negative, zero);
	}
	
}

			
			