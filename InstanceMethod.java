public class InstanceMethod{
public static void main(String[] args){

	InstanceMethod obj = new InstanceMethod();
	System.out.println(obj.addNumber(34,100,388));
	System.out.println(obj.addNumber(10,230));

 }
 
 //Method 
 public int addNumber(int num1, int num2, int num3 ){
	 int addition = num1 + num2 + num3;
	 return addition;
 }
 
 public  int addNumber(int num1, int num2 ){
	 int addition = num1 + num2;
	 return addition;
 }
}

//Instance Methods belong to the object of the class
	
