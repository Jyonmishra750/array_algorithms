import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int temp = 0;
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

        //outer loop for rounds
        for (int i = 1; i < size; i++) {
            //inner loop for comparision
            for (int j = 0; j < size-1; j++) {
                if (arr[j]>arr[j+1]) {
                    //swapping
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("After Sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"\t");
        }
        // for (int x : arr) {
        //     System.out.println(x+"\t");
        // }
    }
}
