public class LongestCommonSubstring {
    public static int Longestlen(String s1,String s2){
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n+1][m+1];
        return helper(n,m,s1,s2,dp);
    }
    public static int helper(int n,int m,String s1,String s2,int dp[][]){
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String s1 ="ABCAB";
        String s2 = "AECB";
        System.out.println(Longestlen(s1, s2));
    }
}
