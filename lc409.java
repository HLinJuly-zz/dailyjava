public class Solution {
    public int longestPalindrome(String s) {
        char[] schar = s.toCharArray();
        int n = s.length();
        int low[] = new int[26];
        int up[] = new int[26];
        int odds = 0;
        for(int i = 0;i<n;i++){
            if(schar[i]<'a') up[schar[i]-'A']++;
            else low[schar[i]-'a']++;
        }
        for(int j = 0;j<26;j++){
            if(low[j]%2==1) odds++;
            if(up[j]%2==1)odds++;
        }
        if(odds==0) return n;
        else return n-odds+1;
    }
}