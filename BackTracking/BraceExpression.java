import java.util.*;
public class BraceExpression{
    static List<String> ans=new ArrayList<>();
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        getWords(str, 0, "");
        System.out.println(ans);
        sc.close();
    }
    public static void getWords(String str,int ind,String p){
        if(ind>=str.length()){
            System.out.println(p);
            ans.add(p);
            return;
        }
        if(str.charAt(ind)=='['){
            int nxt = str.indexOf(']', ind);
            String[] strs = str.substring(ind + 1, nxt).split(",");
            for (String i : strs) {
                getWords(str, nxt + 1, p + i);
            }
        }
        else{
            StringBuilder sb=new StringBuilder();
            while(ind<str.length() && str.charAt(ind)!='['){
                sb.append(str.charAt(ind));
                ind++;
            }
            getWords(str, ind, p+sb.toString());
        }
    }
}

//  [a,b]c[d,ef]