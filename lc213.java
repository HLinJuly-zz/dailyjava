public class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0], nums[1]);
        return Math.max(rob1(nums,0,n-1),rob1(nums,1,n));
    } 
        
    private int rob1(int[] nums, int start, int l){
            int pre=0;
            int cur=nums[start];
            for(int i=start+1;i<l;i++){
                int tem=Math.max(pre+nums[i],cur);
                pre=cur;
                cur=tem;

            }
            return cur;
        }
}