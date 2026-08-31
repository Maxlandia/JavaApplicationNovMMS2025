public class RecursiveMethod{
	public static void main(String[] args){
		displayName("Maximus Aurelius");
	}
	public static void displayName(String name){
		System.out.println(name);
		
		displayName(name);
	}
	
}
.