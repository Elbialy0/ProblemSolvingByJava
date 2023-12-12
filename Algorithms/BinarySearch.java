package Algorithms;

public class BinarySearch {
    public static int lowerBound(int []arr,int value)
    {
        if(arr[arr.length-1]<value)return -1;
        int mid , left=0,right=arr.length-1;
        int result=0;
        while(right>=left)
        {
            mid=(left+right)/2;
            if(arr[mid]>=value)
            {
                result=mid;
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return result+1;
    }
    public static int find (int []arr, int value)
    {
        int mid , left = 0 , right = arr.length-1;
        while (right>=left) {
            mid=(left+right)/2;
            if(arr[mid]==value)
            {
                return mid+1;
            }
            else if(arr[mid]>value)
            {
                right = mid - 1;
            }
            else left = mid + 1;
            
        }
        return -1;
    }

}
