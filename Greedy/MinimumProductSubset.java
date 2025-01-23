package Greedy;

public class MinimumProductSubset {
    public static int minProduct(int arr[]){
        int minPositive = Integer.MAX_VALUE;
        int maxNegative = Integer.MIN_VALUE;
        int countZero = 0, countPosi = 0,countNeg = 0;
        int product = 1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==0){
                countZero++;
            }
            if(arr[i]<0){
                countNeg++;
                maxNegative=Math.max(maxNegative,arr[i]);
            }
            if(arr[i]>0){
                countPosi++;
                minPositive=Math.min(minPositive,arr[i]);
            }
            product *= arr[i];
        }

        if(countZero==arr.length||(countNeg==0 && countZero>0)){
            return 0;
        }

        if(countNeg==0){
            return minPositive;
        }
        if(countNeg%2==0 && countNeg!=0){
            product /= maxNegative;
        }
        return product;
    }    
}
