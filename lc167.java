public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res= new int[2];
        if(numbers.length<2||numbers==null) return res;
        int l=numbers.length;
        int left=0;
        int right=l-1;
        while(left<right){
            int tmp=numbers[left]+numbers[right];
            if(tmp>target)
                right--;
            else if(tmp<target)
                left++;
            else{
                left=left+1;
                right=right+1;
                break;
            }
        }
        res[0]=left;
        res[1]=right;
        return res;
    }
}