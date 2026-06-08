public class TypeCasting{
	public static void main (String[] args){
		double price = 567;
		System.out.printf("The price of the Nuclear Warhead is %f%n", price);
		
		double number = 67.459;
		
		int convertedNumber = (int)number;
		System.out.printf("The USS Gerald Ford cost around %d billion dollars%n", convertedNumber);
		
		char symbol = '?';
		int convertedSymbol = (int)symbol;
		System.out.printf("The ascii code of the character" + "'"+symbol+"'" + "is %d%n", convertedSymbol);
	}
}
