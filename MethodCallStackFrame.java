public class MethodCallStackFrame{
	public static void main(String[] args){
		int x =50;
		add(20,100);
		System.out.println(x);
	}
	public static void add(int x, int y){
		int sum = x + y;
		System.out.println(sum);
		check(15);
	}
	public static void check(int age){
		if (age >=18){
			System.out.println("Ofc Youre now an adult you bum");
		}
	else{
		System.out.println("Nope, Still A Kid Brocachacho");
		}
	}
}