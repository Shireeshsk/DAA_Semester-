package BinarySearch;

public class FixedPoint {
    public static int Fixedpoint(int arr[]){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==mid){
                return mid;
            }
            else if(arr[mid]<mid){
                low = mid +1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
