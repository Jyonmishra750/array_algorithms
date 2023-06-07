import java.util.Scanner;
public class BiggestNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

         for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }

        System.out.println("The biggest number is: "+max);

    }
}