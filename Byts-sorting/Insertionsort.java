import java.util.Scanner;  
public class Insertionsort {

    public static void insertionsort( int[] arr)
    { 
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int k = arr[i];
            int j = i - 1;  
            while (j >= 0 && k < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = k;
    }
}
     public static void printarray(int[] arr)
     {
        for (int i:arr)
        {
            System.out.print(i+" ");
           
        }
        System.out.println();
        
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        insertionsort(arr);
        printarray(arr);
        sc.close();
    }
    
}