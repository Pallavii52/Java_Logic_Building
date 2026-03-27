package Array;

public class AscendingArray {

    public static void main(String[] args)
    {

        int arr[]={23,54,76,67,34,88};
        int n=arr.length;

        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j])  // for descending there is only change use greater than sign
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }

}
