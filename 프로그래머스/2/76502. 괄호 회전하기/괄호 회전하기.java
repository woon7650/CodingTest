import java.util.*;

class Solution {

    public int solution(String s) {
        
        int answer = 0;
        
        //cnt회 회전
        for(int cnt = 0; cnt < s.length(); cnt++){
            if(isValid(s, cnt)){
                answer++;
            }   
        }
        return answer;
    }
    
    //stack의 괄호와 일치하는지 여부
    private boolean matches(char a, char b){
        return (a == '(' && b == ')' || 
                a == '{' && b == '}' || 
                a == '[' && b == ']'
               );
    }
    
    private boolean isValid(String s, int cnt){
        
        int len = s.length();
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i< len; i++){
            char nowChar = s.charAt((i + cnt) % len);
            
            if(nowChar == '(' || nowChar == '{' || nowChar == '['){
                //여는 괄호 저장
                stack.push(nowChar);
            }else{
                //stack에 여는 괄호가 없을 경우
                if(stack.isEmpty()) return false;
                
                char lastOpenChar = stack.pop();
                //stack에 최근 여는 괄호와 일치하는 지
                if(!matches(lastOpenChar, nowChar)) return false;
            }
        }
        //스택에 모든 여는 괄호가 없고 닫는 괄호가 해당 조건을 모두 통과한 경우
        return stack.isEmpty();
    }
}