package com.company;

public class leftRotateArraytemp1 {

    void leftRotate(int arr[], int d, int n) {
        //creating temp array
        int temp[] = new int[d];
        //copying first d element in temp array
        for (int i = 0; i < d; i++)
            temp[i] = arr[i];
        //moving the rest element to index
        //zero to N-d
        for (int i = d; i < n; i++)
            arr[i - d] = arr[i];
        //copying the temp array in orignal array
        for (int i = 0; i < d; i++)
            arr[i + n - d] = temp[i];
    }
    //method 2
    //To print array
    void printArray(int arr[],int n){
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    //method 3
    //Main driver method
    public static void main(String[] args) {
        //create object class inside main()
        leftRotateArraytemp1 rotate=new leftRotateArraytemp1();
        // input array
        int arr[]={1,2,3,4,5,6,7};

        //calling method 1 and 2
        rotate.leftRotate(arr,3,arr.length);
        rotate.printArray(arr, arr.length);

    }
}