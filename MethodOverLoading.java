import java.util.Scanner;



public class MethodOverLoading{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		MethodOverLoading mol = new MethodOverLoading();
		char option;
		
		do{
		System.out.println("Calculating the perimeterof different shapes");
		System.out.println("**************************************");
		System.out.println("Enter 1 for Square");
		System.out.println("Enter 2 for Rectangle");
		System.out.println("Enter 3 for Circle");
		System.out.println("Enter 4 for Trapezium");
		System.out.println("Enter 5 to exit");
		System.out.println("**************************************");
		System.out.print("Enter Your Choice: ");
		int choice = scan.nextInt();
		
		switch(choice){
		case 1: 
				System.out.println("You want to calculatethe perimeter of a square");
				
				System.out.print("Please Enter The Length Of The Square: ");
				int lengthOfSquare = scan.nextInt();
				
				System.out.printf("The perimeter of the sqaure is %d%n",mol.perimeter(lengthOfSquare));
				
		break;
		
		case 2:
				
				System.out.println("You want to calculatethe perimeter of a square");
				
				System.out.print("Please Enter The Length Of The Rectangle:  ");
				int lengthOfRect= scan.nextInt();
				
				System.out.print("Please Enter The Breadth Of The Rectangle: ");
				int breadthOfRect = scan.nextInt();
				
				System.out.printf("The perimeter of the rectangle is %d%n",mol.perimeter(lengthOfRect,breadthOfRect));
				
		break;
		
			case 3: 
				System.out.println("You want to calculate the perimeter of a Circle");
				
				System.out.print("Please Enter The Radius Of The Circle: ");
				double radius = scan.nextDouble();
				
				System.out.printf("The perimeter of the Circle is %f%n",mol.perimeter(radius));
				
		break;
		
			case 4: 
				System.out.println("You want to calculatethe perimeter of a square");
				
				System.out.print("Please Enter The First Side Of The Trapezium: ");
				int side1 = scan.nextInt();
				
				System.out.print("Please Enter The Second Side Of The Trapezium: ");
				int side2 = scan.nextInt();
				
				System.out.print("Please Enter The Third Side Of The Trapezium: ");
				int side3 = scan.nextInt();
				
				System.out.print("Please Enter The Fourth Side Of The Trapezium: ");
				int side4 = scan.nextInt();
				
				System.out.printf("The perimeter of the sqaure is %d%n",mol.perimeter(side1,side2,side3,side4));
				
				
		break;
		
				System.out.print("Do you want to repeat the program?: ");
				option  = scan.next().charAt();
		}while(option == 'y' || option == 'Y');
		default:
				System.out.println("Program Exited- Goodbye");
				
		
		}
		
	}
	
	public int perimeter( int length){
		int per = 4*length;
		return per;
	}
	
	
	public int perimeter( int length, int breadth){
		int per = 2*(length + breadth);
		return per;
	}
	
	
	public double perimeter( double radius){
		double per = 2 * Math.PI * radius;
		return per;
	}
	
	
	public int perimeter( int side1, int side2, int side3, int side4){
		int per = side1 + side2 + side3 + side4;
		return per;
	}
	
}