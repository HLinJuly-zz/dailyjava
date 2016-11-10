public class Solution {
    public int rob(int[] nums) {
        if(nums==null || nums.length ==0)
        return 0;
        // 如果数组中的元素个个数大于2个，对于【A】式，i=2，dp[2-3]不存在
        if(nums.length>2){
            nums[2]+=nums[0];
        }
        
        //from the 4th element
        int i=3;
        for(;i<nums.length;i++){
            //求出第i个元素的最大值
            nums[i]+=Math.max(nums[i-2], nums[i-3]);
            
        }
        // 如果只有一个元素，返回这个元素值
        if(nums.length ==1){
            return nums[0];
            
        }
        // 有两个元素返回其中较大的值
        else if(nums.length ==2){
            return Math.max(nums[0], nums[1]);
        }
        else{
            return Math.max(nums[i-1], nums[i-2]);
        }
        
        
    }
}