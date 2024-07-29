import java.util.Scanner;

public class Sumoffactors{
    
    
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
        System.out.print("Enter the  number: ");
        int num1 = sc.nextInt();
        int sum1 = sumofFactors(num1);
        System.out.println(sum1 + " is the total sum of factors " + num1);   
        sc.close(); 
    }
}