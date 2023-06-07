import java.util.Scanner;
public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
        int arr1[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<size; i++)
        {
            arr1[i]= sc.nextInt();
        }
        
        for(int i =0; i<size; i++)
        {
            System.out.println("Elements are: "+arr1[i]);
        }

        System.out.print("Enter the element to be deleted: ");
        int x= sc.nextInt();
        int j = 0;
        int arr2[] = new int[size-1];
        
        for(int i = 0; i<size; i++)
        {
            if(arr1[i]!=x)
            {
                arr2[j]=arr1[i];
                //System.out.println(arr2[j]);
                j++;
            }
        }
        System.out.println("After deleting the element: ");
        for(int i = 0; i<arr2.length; i++)
        {
            System.out.println("Elements are: "+arr2[i]);
        }


    }
}
