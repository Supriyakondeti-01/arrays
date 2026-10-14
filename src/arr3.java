// count of the even and odd numbers
import java.util.Scanner;
public class arr3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int r=sc.nextInt();
        int[] array=new int[r];
        System.out.println("Enter the array elements");
        for(int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        int even=0;
        int odd=0;
        for(int i : array)
        {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }
        System.out.println("The count of even no in the array is: "+even);
        System.out.println("The count of odd no in the array is: "+odd);
    }
}
