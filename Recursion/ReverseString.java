package Recursion;

public class ReverseString {
    public static void reverse(int l,int r,char arr[]){
        if(l>=r){
            return;
        }
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverse(l+1,r-1,arr);
    }    
    public static void main(String[] args) {
        String str = "hello";
        char arr[] = str.toCharArray();
        reverse(0,arr.length-1,arr);
        System.out.println(arr);
    }
}
