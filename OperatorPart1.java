public class OperatorPart1{
	public static void main(String [] args){
		//assignment operator (=)
		int age = 21;
		System.out.printf("You are %d years old%n", age);
	
		//Arithmetic Operators (+,-,*,/,%)
		int num1 = 35;
		int num2 = 100;
		
		int addition = num1 + num2 ;
		System.out.printf("The sum of %d and %d is equal to %d%n", num1, num2, addition);
		
		int subtraction = num1 - num2 ;
		System.out.printf("The difference between %d and %d is  %d%n", num1, num2, subtraction);
		
		int multiplication = num1 * num2 ;
		System.out.printf("The product of %d and %d is  %d%n", num1, num2, multiplication);
	
	
		double division =  (double)num1 / num2 ;
		System.out.printf("The quotient of %d and %d is equal to %f%n", num1, num2, division);
		
		int remainder = num1 % num2;
		
		System.out.printf("The modulus of %d and %d is equal to %d%n", num1, num2, remainder);
		
		//Compound Assignment Operators
		
		num1 += num2;
		num1 = num1 + num2;
		System.out.printf("The value of num1 has been updated to %d%n",num1);
		
		
		num1 -= num2;
		System.out.printf("The value of num1 has been updated to %d%n",num1);
		
		num1 *= num2;
		System.out.printf("The value of num1 has been updated to %d%n",num1);
		
		num1 /= num2;
		System.out.printf("The value of num1 has been updated to %d%n",num1);
		
		num1 %= num2;
		System.out.printf("The value of num1 has been updated to %d%n",num1);
		
		
		//Relational (Comparison) (>,<,==,!=,>=,<=)
		
		int num3 = 10;
		int num4 =50;
		
		boolean isGreater = num3 > num4;
		System.out.printf("Is %d > %d ? %b%n",num3, num4, isGreater);
		
		
		boolean isLesser = num3 < num4;
		System.out.printf("Is %d < %d ? %b%n",num3, num4, isLesser);
		
		
		boolean isGreaterOrEqual = num3 >= num4;
		System.out.printf("Is %d >= %d ? %b%n",num3, num4, isGreaterOrEqual);
		
		boolean isLesserOrEqual = num3 <= num4;
		System.out.printf("Is %d <= %d ? %b%n",num3, num4, isLesserOrEqual);
		
		boolean isEqual = num3 == num4;
		System.out.printf("Is %d == %d ? %b%n",num3, num4, isEqual);
		
		
		boolean isNotEqual = num3 != num4;
		System.out.printf("Is %d != %d ? %b%n",num3, num4, isEqual);
	}
	
}