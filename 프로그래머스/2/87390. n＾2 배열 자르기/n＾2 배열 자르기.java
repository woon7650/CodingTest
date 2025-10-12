class Solution {
    public int[] solution(int n, long left, long right) {
        int size = (int)(right-left+1);
        int[] arr = new int[size];
        
        for(int i = 0; i< size; i++){
            long nowIndex = left + i;
            int row = (int)(nowIndex / n);
            int col = (int)(nowIndex % n);
            
            arr[i] = Math.max(row, col) + 1;
        }
        
        return arr;
    }
}