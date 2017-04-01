public class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> set=new HashSet<Character>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        char[] cs=s.toCharArray();
        int len=s.length();
        for(int l=0, r=len-1;l<r;){
            if(!set.contains(cs[l])){
                l++;
                continue;
            }
            if(!set.contains(cs[r])){
                r--;
                continue;
            }
            char tmp=cs[l];
                cs[l]=cs[r];
                cs[r]=tmp;
                l++;
                r--;
        }
        return new String(cs);
    }
}