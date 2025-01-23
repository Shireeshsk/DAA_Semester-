package BinarySearch;

public class LongestCommonPrefix {
    public static String longestCommonprefix(String arr[]){
        int minlen = Integer.MAX_VALUE;
        for(String s:arr){
            minlen = Math.min(minlen,s.length());
        }
        int left = 0;
        int right = minlen;

        while(left<=right){
            int mid = left+(right-left)/2;
            if(Contains(arr,mid)){
                left = mid + 1;
            }
            else{
                right = mid -1;
            }
        }
        return arr[0].substring(0,(left+right)/2);
    }

    public static boolean Contains(String arr[],int mid){
        String sk = arr[0].substring(0,mid);
        for(int i = 1;i<arr.length;i++){
            if(!arr[i].startsWith(sk)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + longestCommonprefix(strs));
    }
}
