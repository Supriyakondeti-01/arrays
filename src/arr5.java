import java.util.Scanner;
public class arr5 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int r=sc.nextInt();
        int[] arr9=new int[r];
        int l=arr9.length;
        for(int i=0;i<l;i++)
        {
            arr9[i]=sc.nextInt();
        }
        System.out.println("The reversed array is: ");
        for(int i=l-1;i>=0;i--)
        {
            System.out.print(arr9[i]+" ");
        }
        System.out.println();

    }
}
//size is like 5
//if i keep that as an index then it is 4