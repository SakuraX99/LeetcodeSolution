package src;

public class SolutionForQ14 {
    public static String longestCommonPrefix(String[] strs) {
        int l = strs.length;
        if(l==0){
            return "";
        }
        int minlen = strs[0].length();
        for(int i = 0;i<l;i++){
            int len = strs[i].length();
            if(len<minlen){
                minlen = len;
            }
        }
        int idx = 0;
        int sign = 1;
        for(int i = 0;i<minlen;i++){
            char init = strs[0].charAt(i);

            for(int j = 0;j<l;j++){
                if(strs[j].charAt(i)!=init){
                    sign=0;
                    break;
                }
            }
            if(sign==0){
                break;
            }
            idx+=1;
        }
        if(minlen==0){
            return "";
        }
        else{
            return strs[0].substring(0,idx);
        }
    }

    public static void main(String[] args) {
        String[] x = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(x));
    }
}
