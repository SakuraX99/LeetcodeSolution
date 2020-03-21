package src;

public class SolutionForQ8 {
    final static int upbond = 2147483647;
    final static int lowbond = -2147483648;
    public static int myAtoi(String str) {
        int l = str.length();
        if(l==0){
            return 0;
        }
        int idx1 = 0,idx2 = 0;
        int i;
        int sign = 1;
        for(i = 0;i<l;i++){
            if(str.charAt(i)!=' ') {
                break;
            }
        }
        if(i==l){
            return 0;
        }
        if(str.charAt(i)=='-' ||str.charAt(i)=='+'|| (str.charAt(i)>='0' && str.charAt(i)<='9')){
            if(str.charAt(i)=='-'){
                sign=-1;
                if(i<l)i+=1;
            }
            else if(str.charAt(i)=='+'&&i<l){
                i+=1;
            }
            idx1 = i;
            for(;i<l;i++){
                if(!(str.charAt(i)>='0' && str.charAt(i)<='9')){
                    idx2 = i;
                    break;
                }
            }
            if(i==l)idx2=l;
            long ret = 0;
            for(i = idx1;i<idx2;i++){
                ret = ret*10+((int)str.charAt(i)-48);
                if(ret*sign>upbond){
                    return upbond;
                } else if (ret*sign<lowbond) {
                    return lowbond;
                }
            }
            ret = ret*sign;

                return (int)ret;

    }
        else{
            return 0;
        }
}

    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
    }
    }
