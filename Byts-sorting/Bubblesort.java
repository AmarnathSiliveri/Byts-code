import java.util.Scanner;  
public class Bubblesort {

    public static void bubblesort( int[] arr)
    { 
        int n= arr.length;
        for (int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
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

        bubblesort(arr);
        printarray(arr);
        sc.close();
    }
    
}
