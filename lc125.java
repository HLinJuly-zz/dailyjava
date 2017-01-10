public class Solution {
    public boolean isPalindrome(String s) {
        
        if (s==null){
            return true;
        }
        
        int size = s.length();
        
        
        int l = 0;
        int r = size-1;
        
        while(l<r){
            //number & letter
            while(l<size&&!isAlphanumeric(s.charAt(l))){
                l++;
            }
            while(r>=0&&!isAlphanumeric(s.charAt(r))){
                r--;
            }
            if(l<r){
                char chl = s.charAt(l);
                char chr = s.charAt(r);
                if(chl==chr||((chl>='A'&&chr>='A')&&((chl-chr==32)||(chr-chl==32)))){
                    l++;
                    r--;
                }else{
                    return false;
                }
            }
          
        }
        
        return true;
    }
    private boolean isAlphanumeric(char c){
        
        return (c>='0'&&c<='9')||(c>='A'&&c<='Z')||(c>='a'&&c<='z');
    }
}