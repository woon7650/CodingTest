public class Solution {
    boolean solution(String s) {
        long cntCloseOpenPair = 0;
        for (char c : s.toCharArray()) {
            if(c == '('){
                cntCloseOpenPair += 1;
            }else{
                cntCloseOpenPair -= 1;
            }
            
            if (cntCloseOpenPair < 0){
                return false;
            }
                
        }
        if(cntCloseOpenPair == 0){
            return true;
        }else{
            return false;
        }
    }
}