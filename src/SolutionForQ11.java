package src;

public class SolutionForQ11 {
//    public static int V(int i,int j,int[] array,int[][] volume){
//        if(i==j){
//            volume[i][j] = 0;
//            return 0;
//        }
//        else if(j-i==1){
//            volume[i][j] = Math.min(array[i],array[j]);
//            return volume[i][j];
//        }
//        else{
//
//        }
//    }




    public int maxArea(int[] height) {//双指针中心逼近法
        int maxVolume = 0;
        int currentVolume = 0;
        int len = height.length;
        int i = 0,j = len-1;
        while(i<=j){
            currentVolume = (j-i)*Math.min(height[i],height[j]);
            if(currentVolume>maxVolume){
                maxVolume = currentVolume;
            }
            if(height[i]>=height[j]){
                j-=1;
            }
            else{
                i+=1;
            }
        }
        return maxVolume;

    }

}

