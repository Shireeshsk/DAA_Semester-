package Recursion;

public class GreatestCommonDivisor {
    public static int GCD(int a , int b){
        if(a==b){
            return a;
        }
        else if(a==0){
            return b;
        }
        else if(b==0){
            return a;
        }
        else if(a>b){
            return GCD(a%b,b);
        }
        else{
            return GCD(a,b%a);
        }
    }

    public static void main(String[] args) {
        System.out.println(GCD(10,2));
    }
}
