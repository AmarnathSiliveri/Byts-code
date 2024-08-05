import java.util.Scanner;  
public class Selectionsort {

    public static void selectionsort( int[] arr)
    { 
        int n= arr.length;
        for (int i=0;i<n-1;i++)
        {
            int minindex=i;
            for(int j=i+1;j<n;j++)
            {
                if (arr[j]<arr[minindex])
                {
                    minindex=j;
                }
                int temp=arr[minindex];
                arr[minindex]=arr[i];
                arr[i]=temp;
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

        selectionsort(arr);
        printarray(arr);
        sc.close();
    }
    
}
