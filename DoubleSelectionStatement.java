import java.util.Scanner;


public class DoubleSelectionStatement{
	public static void main(String [] args){
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Enter Your Username: ");
			String userName = scan.nextLine();
			
			System.out.print("Enter your password: ");
			String passWord = scan.nextLine();
			
			//String passWord = "Projecteidolon2035;
			//String userName = "geralt@witcher";
			
			if (passWord.equals("Projecteidolon2035") &&  userName.equals("geralt@witcher")){
				System.out.println("Authorisation Successful, Welcome Back Captain");
			}
			else{
				System.out.println("Authorisation Failed, Please Try Again");
			}
				
				
	}
		
	
}