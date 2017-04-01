public class Solution {
    public void rotate(int[] nums, int k) {
        int l=nums.length;      
        int step=k%l;
        int[] tmp =new int[step];
        for(int i=0;i<step;i++){
            tmp[i]=nums[i+l-step];
        }
        
        for(int i=l-step-1;i>=0;i--){
            nums[i+step]=nums[i];
        }
        for(int i=0;i<step;i++){
            nums[i]=tmp[i];
        }
    }
}