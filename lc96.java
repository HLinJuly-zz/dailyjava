public class Solution {
    public int numTrees(int n) {
        //nums[n]=nums[0]*nums[n-1]+nums[1]*nums[n-2]+...+nums[n-1]*nums[0]
        int[] nums=new int[n+1];
        
        nums[0]=1;
        nums[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=0; j<i;j++){
                nums[i]+=nums[j]*nums[i-j-1];
            }
        }
        
        return nums[n];
        
    }
}