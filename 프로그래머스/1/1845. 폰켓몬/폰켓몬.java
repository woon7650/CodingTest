import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int cnt = nums.length / 2;

        Set<Integer> set = Arrays
                .stream(nums)
                .boxed()
                .collect(Collectors.toSet());
        
        answer = set.size() < cnt ? set.size() : cnt; 
        
        return answer;
    }
}