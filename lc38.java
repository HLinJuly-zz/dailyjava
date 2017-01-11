public class Solution {
    public String countAndSay(int n) {
       if(n==1){
           return "1";
       }
       String result = "1";
       for(int i=2;i<=n;i++){
           StringBuffer buffer = new StringBuffer();
           int count = 1;
           for(int j=1;j<result.length();j++){
               if(result.charAt(j)==result.charAt(j-1)){
                   count++;
               }else{
                   buffer.append(count);
                   buffer.append(result.charAt(j-1));
                   count = 1;
               }

           }
            buffer.append(count);  
            buffer.append(result.charAt(result.length()-1));  
            result = buffer.toString();
           
       }
        
       return result;
        
        
    }
}