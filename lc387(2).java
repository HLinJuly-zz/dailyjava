public class Solution {
    public int firstUniqChar(String s) {

        char[] cs=s.toCharArray();
        for(int i=0;i<cs.length;i++){
            if(s.indexOf(cs[i])==s.lastIndexOf(cs[i])) return i;
            
            
        }
        return -1;
    }
}