public class Solution {
    public int strStr(String haystack, String needle) {
        int hlen = haystack.length();
        int nlen = needle.length();
        
        if(nlen==0) return 0;
        if(nlen>hlen) return -1;
        int j = 1;
        
        for(int i=0;i<=hlen-nlen;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                for (j = 1;j< nlen;j++){
                    if(haystack.charAt(i+j)!=needle.charAt(j)){
                        break;
                    }
                }
                if(j==nlen)  return i;
            }
            
        }
        return -1;
    }
}