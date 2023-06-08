import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int temp = 0, min = 0;
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Before Sorting: ");
        for(int i =0; i<size; i++)
        {
            System.out.println(arr[i]+"\t");
        }

        //for sorting
        for(int i = 0; i<size-1; i++)
        {
            min = i;
            for(int j = i+1; j<size; j++)
            {
                if(arr[min]<arr[j])
                {
                    min = j;
                }
            }

            //swap
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.println("After Sorting: ");
        for(int x : arr)
        {
            System.out.println(x+"\t");
        }
        
    }
}