public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
       // if(nums.length==0) return false;
        for(int i = 0;i<nums.length;i++)
            set.add(nums[i]);
            
        if(set.size()==nums.length)return false;
        else return true;
        
        
    }
}