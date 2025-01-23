package Recursion;

public class ClimbingStairs {
    public static int noofWays(int n){
        if(n<=2){
            return n;
        }
        return noofWays(n-1)+noofWays(n-2);
    }
    public static void main(String[] args) {
        System.out.println(noofWays(3));
    }
}
