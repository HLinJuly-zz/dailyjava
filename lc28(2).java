public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()) return -1;
        if(needle.length()==0) return 0;
      int j=1;
        for(int i = 0; i<=haystack.length()-needle.length();i++){
            if(needle.charAt(0)==haystack.charAt(i)){
                for(j=1;j<needle.length();j++){
                    if(needle.charAt(j)!=haystack.charAt(i+j))
                        break;
                }
                if(j==needle.length())
                        return i;
            }
            
            
            
        }
        
        return -1;
        
        
    }
}