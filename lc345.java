public class Solution {
    public String reverseVowels(String s) {
        char[] sArray = s.toCharArray();
        int length = sArray.length;
        int position = -1;
        int left = 0;
        char [] vow = {'A', 'E', 'I','O', 'U','a','e','i','o','u'};
        int right = length -1;
        while(left<right){
            char leftChar = sArray[left];
            int  leftifin = Arrays.binarySearch(vow, leftChar);
            if (leftifin<0){
                left ++;
                
            }
            char rightChar = sArray[right];
            int rightifin = Arrays.binarySearch(vow, rightChar);
            if(rightifin<0){
                right--;
            }
            if(leftifin>=0&&rightifin>=0){
                char temp = sArray[left];
                sArray[left] = sArray[right];
                sArray[right] = temp;
                left ++;
                right --;
                
            }
            
            
        }
        
        return new String(sArray);
        
        
    }
}