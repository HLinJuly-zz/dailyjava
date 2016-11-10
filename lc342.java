public class Solution {
    public boolean isPowerOfFour(int num) {
        //(num-1)%3==0 ==>num is powerof four
        if (num<0) return false;
        int tmp = num-1;
        return (num & tmp)==0&&(num-1)%3==0;
    }
}