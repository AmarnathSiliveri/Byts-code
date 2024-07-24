import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int endc = (n + 2) / 2;
        
        for (int i = 1; i <= n+1; i++) {
            for (int j = 1; j <= endc; j++) {
                if (i == 1 ) {
                    if (j == 1 || j == endc) {
                        System.out.print(" ");
                    } else {
                        System.out.print(" *");
                    }
                } else if (j == 1 || j == n) {
                    System.out.print(" *");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
