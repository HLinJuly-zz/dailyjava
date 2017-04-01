public class Solution {
    public String reverseString(String s) {
        int len=s.length();
        char[] cs=s.toCharArray();
        int l=0;
        int r=len-1;
        while(l<r){
            char tmp=cs[l];
            cs[l]=cs[r];
            cs[r]=tmp;
            l++;
            r--;
        }

        return new String(cs);
        
    }
}