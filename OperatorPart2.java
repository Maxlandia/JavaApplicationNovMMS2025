public class OperatorPart2{
	public static void main(String [] args){
		int num1 = 15;
		int num2 =  30;
		int num3 = 50;
		
		boolean isOrLogical = (num1 > num2) && (num1 > num3);
		
		boolean isAndLogical = (num1 > num2) || (num1 < num3);
				
		
		boolean isNotLogical = !(num1 > 
		num2) || (num1 < num3);
		
		
		
		
		System.out.printf("Is (%d > %d) && (%d > %d) =%b%n",num1,num2,num1,num3,isAndLogical);
		System.out.printf("Is(%d > %d) && (%d < %d) =%b%n",num1,num2,num1,num3,isOrLogical);
		System.out.printf("Is(%d > %d) & (%d < %d) =%b%n",num1,num2,num1,num3,isNotLogical);
		
		
		//UNARY OPERATORS (++, --)
		//(PRE-INCREMENT, POST-INCREMENT)
		
		int x = 10;
		int y = 20;
		
		System.out.printf("The Value of x is %d%n", ++x);
		System.out.printf("The Value of y is %d%n", y++);
		System.out.printf("The current Value of y is %d%n", y);
		
		System.out.println("-------------UNARY DECREMENT-------------");
		
			System.out.printf("The Value of x is %d%n", --x);
		System.out.printf("The Value of y is %d%n", y--);
		System.out.printf("The current Value of y is %d%n", y);
	}
	
} 