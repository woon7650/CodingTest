class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int y;
        for(int x = yellow; x > 0; x--){
            if(yellow % x == 0){
                y = yellow / x;
                if(brown == (2* (x+y) + 4)){
                    answer[0] = x+2;
                    answer[1] = y+2;
                    break;
                }
            }
        }
        return answer;
    }
}