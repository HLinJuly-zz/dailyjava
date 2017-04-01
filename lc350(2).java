public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1=new HashMap<>();
        ArrayList<Integer> result=new ArrayList<>();
        
        for(int i=0;i<nums1.length;i++){
            if(map1.containsKey(nums1[i]))
                map1.put(nums1[i], map1.get(nums1[i])+1);
            else
                map1.put(nums1[i],1);
        }
        for(int i=0;i<nums2.length;i++){
            if(map1.containsKey(nums2[i])&&map1.get(nums2[i])>0){
                result.add(nums2[i]);
                map1.put(nums2[i],map1.get(nums2[i])-1);
            }
            
        }
        int[] res=new int[result.size()];
        for(int i=0;i<result.size();i++)
            res[i]=result.get(i);
        return res;
        
    }
}