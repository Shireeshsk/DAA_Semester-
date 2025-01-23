public class ClimbingStairs {
    public static int NoofWays(int stairs){
        if(stairs<=2){
            return stairs;
        }
        int n1 = 1;
        int n2 = 2;
        for(int i = 3;i<=stairs;i++){
            int temp = n1;
            n1 = n2;
            n2 = temp+n1;
        }
        return n2;
    }
}
