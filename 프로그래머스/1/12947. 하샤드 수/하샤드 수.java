import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = Integer.toString(x);
        char[] arr = str.toCharArray();
        
        int sum = 0;
        for(char chr : arr){
            sum += Integer.parseInt(Character.toString(chr));
        }
        
        answer = (x % sum == 0 ? true : false);
        
        return answer;
    }
}

