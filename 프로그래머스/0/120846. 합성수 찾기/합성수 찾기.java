class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 4; i<= n; i++){
            int sum = 0;
            for(int s = 1; s <= i; s ++){
                if(i % s ==0){
                    sum++;
                }
            }
            if(sum >= 3){
                answer++;
            }
            
        }
        return answer;
    }
}