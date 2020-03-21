package src;

import java.security.SecureRandom;

public class SolutionForQ5_3 {

    public static int WhetherPali(int i, int j, String s,int[][] pali){
        if(pali[i][j]!=-1){
            return pali[i][j];
        }
        else{
            if(s.charAt(i)!=s.charAt(j)){
                pali[i][j]=0;
                return 0;
            }
            else if(j-i==1 || WhetherPali(i+1,j-1,s,pali)==1){
                pali[i][j] = 1;
                return 1;
            }
            else {
                pali[i][j] = 0;
                return 0;
            }
        }

    }
    public static String longestPalindrome(String s) {//动态规划
        int max = 1;
        int idx1 = 0,idx2 = 0;
        int l = s.length();
        if(l==0){
            return "";
        }
        int i = 0,j = 0;
        int [][] pali = new int [l][l];
//        int [][] multi = new int [l][l];
        for(i = 0;i<l;i++){
            for(j = 0;j<l;j++){
                if(i==j){
                    pali[i][j] = 1;
                }
                else{
                    pali[i][j] = -1;
                }
            }
//            multi[i][i] = 1;
        }//初始化条件

        for (i = 0;i<l;i++){
            for(j = i;j<l;j++){
                if(WhetherPali(i,j,s,pali)==1){
                    if(j-i+1>max){
                        max = j-i+1;
                        idx1 = i;
                        idx2 = j;
                    }
                }
                }
            }



        return s.substring(idx1,idx2+1);

    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("aaabaaaa"));
    }
}
