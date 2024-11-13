import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        /*
        1. 2중 loop 방지를 위해 sort
        2. phone_book loop를 돈다
        3. 다른 문자열과 비교하면서 접두어 인지 확인
        
        접두어 포함 여부 : indexOf() == 0 or startsWith == true
        */        
        Arrays.sort(phone_book);
        
        for(int i = 0; i< phone_book.length-1 ; i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }
        return answer;
    }
}