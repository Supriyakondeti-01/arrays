//sum of array elements
public class arr1 {
    public static void main(String[] args)
    {
        int num[]={1,3,5,6,9};
        int sum=0;
        for(int i=0;i<num.length;i++)
        {
            sum=sum+num[i];
        }
        System.out.println("The sum of the array elements is: "+sum);

        int avg=sum/num.length;
        System.out.println("The average of the array "+avg);

    }



}
