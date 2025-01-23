package Recursion;

public class HappyNumber {
    public static int SumofDigits(int num){
        int sum = 0;
        int temp = num;
        while(temp>0){
            int digi = temp%10;
            sum += digi*digi;
            temp = temp /10;
        }
        return sum;
    }

    public static boolean isHappyNumber(int num){
        if(num == 1){
            return true;
        }
        if(num==4){
            return false;
        }
        return isHappyNumber(SumofDigits(num));
    }

    public static void main(String[] args) {
        System.out.println(isHappyNumber(89)?"Happy Number":"Not a Happy Number ");
    }
}
