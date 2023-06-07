import java.util.Scanner;
public class SearchingElement {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.print("Enter the elements of the array: ");
    for(int i = 0; i<size ; i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.print("Enter the element to be searched: ");
    int x = sc.nextInt();
    for(int i =0; i<size ; i++)
    {
        if(arr[i] == x)
        {
            System.out.println("Yes, "+x+" is present in the array.");
            break;
        }
    }
   } 
}
