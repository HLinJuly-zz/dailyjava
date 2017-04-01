public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s=new HashSet<Integer>();
        Set<Integer> res=new HashSet<Integer>();
        for(int i=0;i<nums1.length;i++){
            s.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(s.contains(nums2[i]))
                res.add(nums2[i]);
        }
        int l=res.size();
        int[] result=new int[l];
        int i=0;
        for(Integer in:res){
            result[i++]=in;
        }
        return result;
    }
}