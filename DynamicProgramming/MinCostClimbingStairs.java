public class MinCostClimbingStairs {
    public static int MinCost(int arr[]){
        int first = arr[0];
        int second = arr[1];
        for(int i = 2 ;i<arr.length;i++){
            int curr = arr[i] + Math.min(first,second);
            first = second;
            second = curr;
        }
        return Math.min(first,second);
    }
}
