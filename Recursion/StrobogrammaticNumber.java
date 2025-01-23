package Recursion;
import java.util.*;

public class StrobogrammaticNumber{
    public static List<String> Strobo(int len){
        return helper(len,len);
    }

    public static List<String> helper(int k,int n){
        if(k==0){
            return new ArrayList<>(Arrays.asList(""));
        }
        if(k==1){
            return new ArrayList<>(Arrays.asList("0","1","8"));
        }

        List<String> sublist = helper(k-2,n);
        List<String> res = new ArrayList<>();
        for(String i : sublist){
            if(k!=n){
                res.add("0"+i+"0");
            }
            res.add("1"+i+"1");
            res.add("6"+i+"9");
            res.add("8"+i+"8");
            res.add("9"+i+"6");
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Strobo(3));
    }
}