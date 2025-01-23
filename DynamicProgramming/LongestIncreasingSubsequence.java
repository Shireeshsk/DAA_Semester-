import java.util.*;
public class LongestIncreasingSubsequence {
    public static int LongestSeqlen(int arr[]){
        int dp[] = new int[arr.length];
        Arrays.fill(dp,1);
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<i;j++){
                if(arr[i]>arr[j]){
                    dp[i] = Math.max(dp[i],1+dp[j]);
                }
            }
        }
        int maxlen = Integer.MIN_VALUE;
        for(int i:dp){
            maxlen = Math.max(maxlen,i);
        }
        return maxlen;
    }
}
