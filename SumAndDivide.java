//accept 10 numbers and add the 6-10 number and add it to the sum of the 2-9 number and divide by the sum of 2-5 number
import java.util.Scanner;

public class SumAndDivide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;
        int number;
        int sum6to10 = 0;
        int sum2to9 = 0;
        int sum2to5 = 0;

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            number = input.nextInt();

            
            if (i >= 6 && i <= 10) {
                sum6to10 += number;
				
            }

            
            if (i >= 2 && i <= 9) {
                sum2to9 += number;
            }

            
            if (i >= 2 && i <= 5) {
                sum2to5 += number;
            }

            i++;
        }

        double result = (double)  (sum6to10 + sum2to9) / sum2to5;

        System.out.println("Result = " + result);
		
		System.out.println(sum6to10);

        
    }
}