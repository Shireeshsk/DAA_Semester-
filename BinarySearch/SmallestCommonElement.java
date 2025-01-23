package BinarySearch;

public class SmallestCommonElement {
    public static boolean binarysearch(int arr[],int target){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]>target){
                right = mid -1;
            }
            else{
                left = mid + 1;
            }
        }
        return false;
    }

    public static int smallestCommon(int arr[][]){
        for(int i = 0;i<arr[0].length;i++){
            int target = arr[0][i];
            boolean isCommon = false;

            for(int j = 1;j<arr.length;j++){
                if(!binarysearch(arr[j], target)){
                    isCommon = false;
                    break;
                }
            }
            if(isCommon){
                return target;
            }
        }
        return -1;
    }
}
