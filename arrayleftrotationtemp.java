

public class arrayleftrotationtemp {
    void leftrotate(int arr[],int d,int n)

            //method 1
    {
        int[] temp=new int[d];
        for (int i=0; i<d;i++)
            temp[i]=arr[i];
        for (int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for (int i=0;i<d;i++) arr[i + n - d] = temp[i];
    }



    //method 2
    void printarray (int arr[],int n)
    {
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+ " ");
    }
    ///method 3
    public static void main(String[] args) {
        arrayleftrotationtemp rotate =new arrayleftrotationtemp();
        int arr[]={1,2,3,4,5};
        rotate.leftrotate(arr,2, arr.length);
        rotate.printarray(arr, arr.length);
    }

}
