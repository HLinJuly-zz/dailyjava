public class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] sarray = s.toCharArray();
        char[] tarray = t.toCharArray();
        
        Arrays.sort(sarray);
        Arrays.sort(tarray);
        
        return String.valueOf(sarray).equals(String.valueOf(tarray));
        
        
    }
}