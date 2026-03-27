package Array;

public class smallestelement {

    public static void main(String[] args)
    {
        int arr[]={39,56,45,24,76};

        int smallest=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                smallest=arr[i];
            }
        }
        System.out.println("Smallest element is array is : "+smallest);
    }
}
