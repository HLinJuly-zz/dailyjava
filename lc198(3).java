public class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        int t0=0;
        int t1=0;
        
        //sum[i-2]+nums[i], sum[i]
        for(int i=0;i<n;i++){
            int tem=t0;
            t0=Math.max(t1, t0);
            t1=tem+nums[i];
        }        
        return Math.max(t0, t1);
        
    }
}