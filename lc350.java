public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i<nums1.length;i++){
            if(map.containsKey(nums1[i])) 
                map.put(nums1[i], map.get(nums1[i])+1);
            else 
                map.put(nums1[i], 1);
        }
        
        ArrayList<Integer> resultlist = new ArrayList<Integer>();
        for(int i= 0; i<nums2.length;i++){
            if(map.containsKey(nums2[i])) {
                if(map.get(nums2[i])>0){
                    resultlist.add(nums2[i]);
                    map.put(nums2[i], map.get(nums2[i])-1);
                    
                }
            }
            
            
        }
        
        int[] result = new int[resultlist.size()];
        for(int i = 0; i<resultlist.size();i++){
            result[i] = resultlist.get(i);
        }
        return result;        
    }
}