import java.util.Scanner;

public class MultipleSwitchCaseStatement{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Your Full Name Twat: ");
		String name = input.nextLine();
		System.out.print("Enter Your Score: ");
		int score = input.nextInt();
		
		switch(score/10){
			case 0:
			case 1:
			case 2:
			case 3:
			System.out.printf("============================\n\n");
				System.out.printf("Student Name: %s%n", name);
				System.out.printf("Score: %s%n", score);
				System.out.println("Student Grade: F");
				System.out.printf("============================\n\n");
			break;
			
			case 4:
			System.out.printf("============================\n\n");
				System.out.printf("Student Name: %s%n", name);
				System.out.printf("Score: %s%n", score);
				System.out.println("Student Grade: D");
				System.out.printf("============================\n\n");
			break;
			
			case 5:
			System.out.printf("============================\n\n");
				System.out.printf("Student Name: %s%n", name);
				System.out.printf("Score: %s%n", score);
				System.out.println("Student Grade: C");
				System.out.printf("============================\n\n");
			break;
			
			case 6:
			System.out.printf("============================\n\n");
			System.out.printf("Student Name: %s%n", name);
				System.out.printf("Score: %s%n", score);
				System.out.println("Student Grade: B");
				System.out.printf("============================\n\n");
			break;
			
			case 7:
			case 8:
			case 9:
			case 10:
			System.out.printf("Student Name: %s%n", name);
				System.out.printf("Score: %s%n", score);
				System.out.println("Student Grade: A");
			break;
			default:
					System.out.println("Invalid Input");
					
		}
	}
}