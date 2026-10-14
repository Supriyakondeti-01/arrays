//minimum number in the array


import java.util.Scanner;
public class arr4 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n=sc.nextInt();
        int[] num3=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<num3.length;i++)
        {
            num3[i]=sc.nextInt();
        }
        int min=num3[0];
        for(int i=0;i<num3.length;i++)
        {
            if(num3[i]<min)
            {
                min=num3[i];
            }

        }
        System.out.println("The min no in the array is: "+min);


    }
}
