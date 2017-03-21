public class Solution {
    public int rob(int[] nums) {
        int best0 = 0; //choose current house
        int best1 = 0; // do not choose current house
        for(int i = 0; i < nums.length; i++){
            int temp = best0;
            best0 = Math.max(best0, best1);
            best1 = temp + nums[i];
        }
        return Math.max(best0, best1);
    }
}