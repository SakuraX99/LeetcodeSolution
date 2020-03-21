package src;

public class SolutionForQ5_2 {
    //中心扩散法
    public static String longestPalindrome(String s) {
        int max = 0;
        int idx1 = 0,idx2 = 0;
        int l = s.length();
        if(l==0){
            return "";
        }
        int i = 0,j = 0;
        //n个节点和n-1个中心间隔点
        for(i =0;i<l;i++) {
            int l1 = Math.min(i, l - i - 1);
            for (j = 0; j <= l1; j++) {
                if (s.charAt(i - j) != s.charAt(i + j)) {
                    break;
                } else {
                    if (1 + 2 * j > max) {
                        max = 1 + 2 * j;
                        idx1 = i - j;
                        idx2 = i + j;
                    }
                }
            }
        }
        for(i = 0;i<l-1;i++){
            int l2 = Math.min(i+1,l-i-1);
            for(j = 0;j<l2;j++){
                if(s.charAt(i-j)!=s.charAt(i+j+1)){
                    break;
                }
                else{
                    if(2*(j+1)>max){
                        max = 2*(j+1);
                        idx1 = i-j;
                        idx2 = i+j+1;
                    }
                }
            }

        }
        return s.substring(idx1,idx2+1);

    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }

}
