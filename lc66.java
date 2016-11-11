public class Solution {
    public int[] plusOne(int[] digits) {
        int c = 1;
        for(int i = digits.length -1; i>=0;i--){
            int sum = digits[i] +c;
            if(sum<10){
                digits[i] = sum;
                return digits;
            }
            else{
                digits[i] = 0;
                c= 1;
                
            }
            
        }
        if(c==1&&digits[0]==0){
            int [] newD = new int[digits.length+1];
            for(int i = 1; i<digits.length;i++){
                newD[i+1]= digits[i];
            }
            newD[0] = 1;
            return newD;
            
        }
        return digits;
        
        
    }
}