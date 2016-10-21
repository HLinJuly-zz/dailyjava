public class Solution {
    public int firstUniqChar(String s) {
       /* 
        for(int i=0;i<s.length();i++){
            if (s.lastIndexOf(s.charAt(i))==s.indexOf(s.charAt(i))) return i;

            
        }
        return -1;        
        */
        char[] sChar = s.toCharArray();
        int[] a = new int[26];
        for(int i = 0; i<s.length();i++){
            a[sChar[i]-'a']++;
        }
        for(int i = 0;i<s.length();i++){
            
            if(a[sChar[i]-'a']==1)
                return i;
        }
        return -1;
    }
}