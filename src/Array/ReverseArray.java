package Array;

public class ReverseArray {

    public static void main(String[] args)
    {
        int arr[]={24,54,37,67,45};

        int start=0;
        int last=arr.length-1;

        while(start<last)
        {
            int temp=arr[start];
            arr[start]=arr[last];
            arr[last]=temp;

            start++;
            last--;
        }
        for(int num: arr)
        {
            System.out.print(num+" " );
        }

    }
}
