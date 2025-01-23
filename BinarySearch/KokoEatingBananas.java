package BinarySearch;

public class KokoEatingBananas {
    public static int minspeed(int arr[],int h){
        int left = 1;
        int right = maxPile(arr);
        while(left<=right){
            int mid = left+(right-left)/2;
            if(calTime(arr, mid)>h){
                right=mid-1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }

    public static int calTime(int arr[],int mid){
        int time = 0;
        for(int i:arr){
            time += Math.ceil((double)i/mid);
        }
        return time;
    }

    public static int maxPile(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i:arr){
            max = Math.max(max,i);
        }
        return max;
    }
}
