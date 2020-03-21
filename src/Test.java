package src;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();


        for(int i =0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int j = 0;j<nums.length;j++){
            if(map.containsKey(target-nums[j]) && j!=map.get(target-nums[j])){
                int [] ret = new int[2];
                ret[0] = j<map.get(target-nums[j])?j:map.get(target-nums[j]);
                ret[1] = j<map.get(target-nums[j])?map.get(target-nums[j]):j;
                return ret;
            }
        }
        throw new IllegalArgumentException("None!");

    }
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}
