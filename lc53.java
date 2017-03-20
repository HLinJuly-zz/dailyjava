public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0) return 0;
        int max=nums[0];
        int local=nums[0];
        for(int i=1;i<nums.length;i++){
            local = Math.max(local+nums[i],nums[i]);
            max=Math.max(max, local);
            
        }
        return max;
        
    }
}