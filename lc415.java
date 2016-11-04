public class Solution {
    public String addStrings(String num1, String num2) {
        if (num1.length()==1&&num2.length()==1){
            return (int)(((int)num1.charAt(0) + (int)num2.charAt(0)) - 2*(int)'0')+"";
        }
        int maxLen = Math.max(num1.length(), num2.length());
        int[] numArr1 = new int[maxLen];
        int[] numArr2 = new int[maxLen];
        for (int i=0; i<num1.length(); i++) {
            numArr1[i] = num1.charAt(num1.length()-i-1) - '0';
        }
        for (int i=0; i<num2.length(); i++) {
            numArr2[i] = num2.charAt(num2.length()-i-1) - '0';
        }
        char[] sum = new char[maxLen+1];
        int carry = 0;
        for (int i=0; i<maxLen; i++) {
            sum[i] = (char)((numArr1[i] + numArr2[i] + carry)%10 + (int)'0');
            carry = (numArr1[i] + numArr2[i] + carry) / 10;
        }
        sum[maxLen] = (char)(carry+'0');
        int noz = maxLen;
        while (sum[noz--] == '0');
        StringBuilder ret = new StringBuilder();
        for (int i=noz+1; i>=0; i--) {
            ret.append(sum[i]);
        }
        return ret.toString(); 
    }
}