package src;

public class SolutionForQ7 {
    final static int upbond = (int)Math.pow(2,31)-1;
    final static int lowbond = (int)Math.pow(2,31);

    public static int reverse(int x){
        long x1;
        if(x<0){
         x1 = -((long)x);}
        else{
            x1 = x;
        }
        long x2 = 0;
        while(x1!=0){
            x2 = x2*10+x1%10;
            x1 = x1/10;
        }
        if((x>0 && x2>upbond) || (x<0 && x2>lowbond)){
            return 0;
        }

        return (int)(x>=0?x2:-x2);
    }

    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }



}

