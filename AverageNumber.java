//Write a java method to calculate the average of 3 numbers (USE SCANNER)
import java.util.Scanner;


public class AverageNumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Enter the First Number:  ");
		int a = scan.nextInt();
		
		System.out.print("Enter the Second Number:  ");
		int b = scan.nextInt();
		
		System.out.print("Enter the Third Number:  ");
		int c = scan.nextInt();
		
		checkAverage(a, b, c);
	}
	
	public static void checkAverage(int a, int b, int c){
		 int sum = a +  b +  c ;
		 double average = sum / 3.0;
		
		System.out.print("The average of the 3 numbers is " + average);
	}
}
	