package src;

public class SolutionForQ5_1 {
        public static String longestPalindrome(String s) {
            int i,j,k;
            int max = 0;
            int idx1=0,idx2=0;
            int len = s.length();
            for(i = 0 ;i<len;i++){
                for(j = len-1;j>=i;j--){
                    if(s.charAt(i)==s.charAt(j)){
                        int sign = 1;
                        for(k = 0;k<j-i && j-k>=i+k;k++){
                            if(s.charAt(i+k)!=s.charAt(j-k)){
                                sign = 0;
                                break;
                            }
                        }
                        if(sign==1){
                            if(j-i+1>max){
                                max = j-i+1;
                                idx1 = i;
                                idx2 = j;
                            }
                        }
                    }
                }
            }
            if(max!=0){
                return s.substring(idx1,idx2+1);
            }
            else{
                return "";}
        }

        public static void main(String[] args) {
            System.out.println(longestPalindrome("aaabaaaa"));
        }
}
