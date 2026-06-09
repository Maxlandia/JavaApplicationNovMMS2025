import java.util.Scanner;



public class UserInput{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter Your Name Captain: ");
		String fullName = input.nextLine();
		
		System.out.printf("Validating%n ");
		System.out.printf("Name not found, Creating new Entry in the database. Please hold on%n ");
		System.out.printf("New user Created%n");
		
		
		System.out.print("Enter your age: ");
		byte age = input.nextByte();
		input.nextLine();
		
		System.out.print("Please enter the address where you want all mails and equipment sent to you to be directed to:");
		String address = input.nextLine();
		
		
		
		System.out.printf("============================================================================================================\n\n");
		System.out.printf("Welcome Aboard the Resolute Captain %s, Systems are now Online, The ship will begin its rebooting sequence immediately%n", fullName);
		System.out.printf("Captain %s, Your Age Has been stored, you are %d years old%n", fullName,age);
		System.out.printf("Noted, all mail and equipment sent to you will be directed to %s%n", address);
	}
	
}