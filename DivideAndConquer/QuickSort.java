package DivideAndConquer;
import java.util.*;
public class QuickSort{
    public static int partition(int arr[],int start,int end){
        int pivot = arr[end];
        int idx = start-1;
        for(int i = start;i<end;i++){
            if(arr[i]<=pivot){
                idx++;
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[idx+1];
        arr[idx+1] = arr[end];
        arr[end] = temp;
        return idx+1;
    }

    public static void sort(int arr[],int left,int right){
        if(left>=right){
            return;
        }
        int pivot = partition(arr,left,right);
        sort(arr,left,pivot-1);
        sort(arr,pivot+1,right);
    }

    public static void main(String[] args) {
        int[] arr = {4,6,2,5,7,9,1,3};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}