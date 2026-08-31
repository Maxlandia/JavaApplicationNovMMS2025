//Write a java method to find the smallest number among 3 numbers(USE SCANNER)
import java.util.Scanner;

public class SmallestNumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Enter the First Number:  ");
		int a = scan.nextInt();
		
		System.out.print("Enter the Second Number:  ");
		int b = scan.nextInt();
		
		System.out.print("Enter the Third Number:  ");
		int c = scan.nextInt();
		
		checkSmall(a, b, c);
	}
	
	
	public static void checkSmall(int a, int b, int c){
		
		
		int smallest = a;
		
		if (b < smallest){
			smallest = b;
		}
		if (c < smallest){
		smallest = c;
		}
	
		System.out.println("The smallest number of these 3 numbers is  "  +   smallest);
	}
}
		
		
