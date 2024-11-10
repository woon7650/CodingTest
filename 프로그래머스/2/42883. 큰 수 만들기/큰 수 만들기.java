import java.util.*;

class Solution {
    public String solution(String number, int k) {
        String answer = "";
        /*
        k개 제거
        남은 길이 number.length - k
        1. 0 ~ number.length -k + 1 번쨰 사이 수 중에 n번째에 위치한 가장 큰 수를 뽑는다
        2. n+1 ~ number.length - k + 2 번쨰 수 중에 m번째에 위치한 가장 큰 수를 뽑는다
        1,2,... 반복
        */
        int str_len = number.length() - k;
        int arr_num = 0;
        char[] chr = number.toCharArray();

        StringBuilder str = new StringBuilder();

        for(int i = 0; i< str_len; i++){
            char max = '0';
            for(int j = arr_num ; j <= k + i ; j++){
                if(chr[j] > max){
                    arr_num = j + 1;
                    max = chr[j];
                }
            }
            str.append(max);

        }
        answer = str.toString();
        return answer;
    }
}