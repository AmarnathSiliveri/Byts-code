import java.util.Scanner;
import java.lang.Math;

public class Sumofsquarenumbers
{
    public static boolean sqSum(int n) {
        if (n<=0) return false;
        else 
        {
            for (int i=0;i<=Math.sqrt(n);i++)
            {
                int j=n-i*i;
                int s= (int) Math.sqrt(j);
                if (s*s == j) ;
            }
            return true;

        }
    }
    public static void main(String[] args)
        {
            System.out.println("Enter a number:");
            Scanner sc =new Scanner(System.in);
            int n=sc.nextInt();
            if (sqSum(n))
            {
                System.out.println(n+"can be represented as sum of squares numbers");

            }
            sc.close();

        }

}
