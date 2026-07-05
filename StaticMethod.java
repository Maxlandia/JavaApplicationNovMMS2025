public class StaticMethod{
public static void main(String[] args){
	
	System.out.println(StaticMethod.addNumber(34,390,313));
	System.out.println(addNumber(390,313));
	System.out.println(addNumber(390,313));
	System.out.println(addNumber(30,5002,2313));
	System.out.println(addNumber(39,13));
	System.out.println(addNumber(0,22,313));
	System.out.println(addNumber(390,992,33));
	System.out.println(addNumber(90,113));
	System.out.println(addNumber(3,31));
	System.out.println(addNumber(20,3,49));
	

 }
 
 //Method 
 public static int addNumber(int num1, int num2, int num3 ){
	 int addition = num1 + num2 + num3;
	 return addition;
 }
 
 public static int addNumber(int num1, int num2 ){
	 int addition = num1 + num2;
	 return addition;
 }
}

//Static Methods 	
//Static mdthods belong to a class, not to any particular object