class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i = 0; i< arr1.length; i++){
            for(int s = 0; s < arr1[0].length; s++){
                answer[i][s] = arr1[i][s] + arr2[i][s];
            }
        }
        
        return answer;
    }
}