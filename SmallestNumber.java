import java.util.Scanner;
public class SmallestNumber
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

        int min = arr[0];

         for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }

        System.out.println("The smallest number is: "+min);

    }
}
