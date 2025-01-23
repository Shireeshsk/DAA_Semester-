package DivideAndConquer;

public class MajorityElement {
    public static int countInRange(int arr[],int target,int left,int right){
        int count = 0;
        for(int i = left;i<=right;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }

    public static int majorityElement(int arr[],int left,int right){
        return helper(arr,left,right);
    }

    public static int helper(int arr[],int left,int right){
        if(left==right){
            return arr[left];
        }
        int mid = left+(right-left)/2;
        int leftMajor = helper(arr,left,mid);
        int rightMajor = helper(arr,mid+1,right);

        if(leftMajor==rightMajor){
            return leftMajor;
        }

        int leftMajorCount = countInRange(arr, leftMajor, left, right);
        int rightMajorCount = countInRange(arr, rightMajor, left, right);
        
        return leftMajorCount>rightMajorCount?leftMajor:rightMajor;
    }

    public static void main(String[] args) {
        int arr[] = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        System.out.println(majorityElement(arr, 0, arr.length-1));
    }
}
