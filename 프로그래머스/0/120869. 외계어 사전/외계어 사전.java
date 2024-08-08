import java.util.*;


class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(String d : dic){
            String[] arr = d.split("");
            if(Arrays.asList(arr).containsAll(Arrays.asList(spell))){
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}