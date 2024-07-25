import java.util.Scanner;

public class Amicable{
    
    
    public static int sumofFactors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) { 
            if (num % i == 0) {
                sum += i; 
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        
        int sum1 = sumofFactors(num1);
        int sum2 = sumofFactors(num2);
        
        
        if (sum1 == num2 && sum2 == num1) {
            System.out.println(num1 + " and " + num2 + " are amicable numbers.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not amicable numbers.");
        }
        
        sc.close(); 
    }
}