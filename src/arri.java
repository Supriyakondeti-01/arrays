import java.awt.*;
import java.util.Scanner;

public class arri {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int a=sc.nextInt();
        int[] arr1=new int[a];//declaration of the size in array
        System.out.println("Enter the array elements: ");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("The array elements are: ");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }


    }
}
