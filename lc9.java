public class Solution {
    public boolean isPalindrome(int x) {
        int t=x;
        int re=0;
        
        if(x<0) return false;
        while(t>0){
            re=re*10+t%10;
            t=t/10;
            
        }
        return re==x;
        
    }
}