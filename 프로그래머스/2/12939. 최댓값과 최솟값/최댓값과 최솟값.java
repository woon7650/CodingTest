class Solution {
    public String solution(String s) {
        String answer = "";

        String max = findMax(s).toString();
        String min = findMin(s).toString();
        answer = addStr(min, max);
        return answer;
    }

    public Integer findMax(String input){
        String arr[];
        int max = -9999;
        arr = input.split(" ");
        for(String value : arr){
            int tmp = Integer.parseInt(value);
            if(tmp >= max){
                max = tmp;
            }
        }

        return max;
    }
    public Integer findMin(String input){
        String arr[];
        int min = 9999;
        arr = input.split(" ");
        for(String value : arr){
            int tmp = Integer.parseInt(value);
            if(tmp <= min){
                min = tmp;
            }
        }
        return min;
    }
    public String addStr(String min, String max){
        return min + " " + max;
    }
}