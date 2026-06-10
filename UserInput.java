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
		
		System.out.print("How many crew mates would you prefer to work alongside you on the Resolute?(minimum of 8): ");
		short numberOfCrewmen = input.nextShort();
		
		System.out.print("Whats the farthest from earth you have travelled before (all answers in km): ");
		int farthestDistance = input.nextInt();
		
		
		System.out.print("Enter your gender(M/F): ");
		char gender = input.next().charAt(0);
	
		
		
		System.out.printf("============================================================================================================\n\n");
		System.out.printf("Welcome Aboard the Resolute Captain %s, Systems are now Online, The ship will begin its rebooting sequence immediately%n", fullName);
		System.out.printf("Captain %s, Your Age Has been stored, you are %d years old%n", fullName,age);
		System.out.printf("Captain %s, you have selcted %c as your gender%n", fullName, gender);
		System.out.printf("Noted, all mail and equipment sent to you will be directed to %s%n", address);
		System.out.printf("Acknowledged, you'll be assigned %d crew members to help alongside the Resolute%n", numberOfCrewmen);
		System.out.printf("The farthest you have travelled from earth is %,d kilometers%n", farthestDistance);
	
		
	}
	
}