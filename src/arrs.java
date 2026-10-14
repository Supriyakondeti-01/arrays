//combinations of strings
public class arrs {
    public static void main(String[] args) {
        String[] arr = {"hi ",", ", "i ", "am ", "Supriya ", "nice to meet you all "};
        String sentence="";
        for(int i=0;i<arr.length;i++)
        {
            sentence=sentence+arr[i];
        }
        System.out.println("The complete sentence is: "+sentence);

    }

}
