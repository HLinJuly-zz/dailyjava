public class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map=new HashMap<>();
        char[] cs=s.toCharArray();
        char[] ct=t.toCharArray();
        int len=s.length();
        if(len==0||len==1) return true;
        for(int i=0;i<len;i++){
            if(!map.containsKey(cs[i])){
                if(!map.containsValue(ct[i])){
                    map.put(cs[i], ct[i]);}
                else return false;
            }
            else{
                if(!map.get(cs[i]).equals(ct[i])) return false;
                else
                    continue;
            }
        }
        return true;
    }
}