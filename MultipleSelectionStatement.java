import java.util.Scanner;


public class MultipleSelectionStatement{
	public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Enter Your Fuckass Name: ");
			String name = scan.nextLine();
			
			System.out.print("Enter Your Score: ");
			int score = scan.nextInt();
			
			if(score >=70){
				System.out.printf("Student Name: %s%n", name);
				System.out.printf("Score: %s%n", score);
				System.out.println("Student Grade: A");
			}
			
			else if(score >=60){
				System.out.printf("Student Name: %s%n", name);
				System.out.printf("Score: %s%n", score);
				System.out.println("Student Grade: B");
			}
			else if(score >=50){
				System.out.printf("Student Name: %s%n", name);
				System.out.printf("Score: %s%n", score);
				System.out.println("Student Grade: C");
			}
			else if(score >=40){
				System.out.printf("Student Name: %s%n", name);
				System.out.printf("Score: %s%n", score);
				System.out.println("Student Grade: D");
			}
				
			
			else if(score >100){
					System.out.printf("Incorrect Score, Try Again");
			
			}
			break;
			
			else if(score !==-99){
				System.out.printf("Student Name: %s%n", name);
				System.out.printf("Score: %s%n", score);
				System.out.println("Student Grade: F");
			}
			

		
		
		
		
}
}