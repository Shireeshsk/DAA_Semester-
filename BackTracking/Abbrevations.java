import java.util.*;
public class Abbrevations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.err.println(getAbbrevations(str));
        sc.close();
    }
    private static List<String> getAbbrevations(String str){
        List<String> ans=new ArrayList<>();
        helper(str,0,0,ans);
        Collections.sort(ans);
        return ans;
    }
    private static void helper(String str,int idx,int prev,List<String> result){
        if(idx==str.length()){
            result.add(str);
            return;
        }
        helper(str,idx+1,0,result);
        StringBuilder temp=new StringBuilder(str);
        if(prev==0){
            temp.replace(idx, idx+1, "1");
            prev=1;
        }
        else{
            temp.replace(idx-1,idx+1,prev+1+"");
            prev++;
            idx--;
        }
        helper(temp.toString(), idx+1,prev, result);
    }
}
