package src;

import java.util.HashMap;
import java.util.Map;


public class SolutionForQ3 {

    public static int lengthOfLongestSubstring(String s) {
        int sign[] = new int[128];
        int seq[] = new int[128];
        for(int i = 0;i<128;i++){
            sign[i] = 0;
            seq[i] = -1;
        }//Store current information

        int start = 0;
        int max = 0;
        int curlen = 0;
        int l = s.length();

            for(int j = start;j<l && start<l-max;j++){
                System.out.println("sign:"+sign[116]);
                System.out.println("seq:"+seq[116]);
                int idx = (int)s.charAt(j);
                if(sign[idx]==0){
                    sign[idx] = 1;
//                    c.valid=1;
                    seq[idx]=j;
                    curlen+=1;
                    if(curlen>max){
                        max = curlen;
                    }
                }
                else{
                    start = seq[idx]+1;
                    for(int x = 0;x<128;x++){
                        if(sign[x]==1 && seq[x]<start){
                            sign[x]=0;
                            seq[x]=-1;
                        }
                    }
                    sign[idx] = 1;
                    seq[idx] = j;
                    curlen = j-start+1;
                }
            }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("tmmzuxt"));
    }
}
