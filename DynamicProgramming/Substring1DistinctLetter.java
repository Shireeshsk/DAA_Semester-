public class Substring1DistinctLetter {
    public static int subStr(String str){
        int count = 1;
        int sum = 1;
        for(int i = 1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else{
                count = 1;
            }
            sum +=count;
        }
        return sum;
    }
}
