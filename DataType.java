public class DataType{
	public static void main(String[] args){
		byte age = 25;
		System.out.printf("You are %d years old%n", age);
		
		short quantity = 30000;
		System.out.printf("I bought %,d quantity of Phones%n", quantity);
		
		int population = 2057315598;
		System.out.printf("The population of the city states is %,d%n", population); 
		
		long worldPopulation = 1004943920480493L;
		System.out.printf("The World population has jumped to %,d in just ten years%n",worldPopulation);
		
		float myBalance = 670394960.9588F;
		System.out.printf("Your account balance is $%,.2f%n",myBalance);

		double cbnBalance = 796949569786545394596976594.568767554;
		System.out.printf("The CBN has $%,.2f%n", cbnBalance);


		char symbol = '@';
		System.out.printf("Your email address is asciicod571%cgmail.com%n", symbol);
		
		
		boolean isJava = true;
		System.out.printf("Do you love learning? %b%n", isJava);
		
		String students = "Max";
		System.out.printf("My name is %s", students);
	}

}