//Write a java method that will accept 5 numbers from a user and checks if the sum of the 5 numbers are even or odd numbers 


import java.util.Scanner;


public class EvenOrOdd{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Enter the First Number:  ");
		int a = scan.nextInt();
		
		System.out.print("Enter the Second Number:  ");
		int b = scan.nextInt();
		
		System.out.print("Enter the Third Number:  ");
		int c = scan.nextInt();
		
		System.out.print("Enter the Fourth Number:  ");
		int d = scan.nextInt();
		
		System.out.print("Enter the Fifth Number:  ");
		int e = scan.nextInt();
		checkStatus(a,b,c,d,e);
	}
	
	public static void checkStatus(int a, int b, int c, int d, int e){
		
		int sum = a + b + c + d + e;
		
		if(sum % 2 == 0){
			System.out.print("The sum of all 5 numbers is " + sum + " which is  an even number");
		}
		else{
		System.out.print("The sum of all 5 numbers is " + sum + " which is an odd number");
		}
	
	}
	
}