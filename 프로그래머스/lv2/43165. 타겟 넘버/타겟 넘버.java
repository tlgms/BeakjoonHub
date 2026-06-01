class Solution {
    int count;
    int[] numbers;
    int target;    
    
    public int solution(int[] numbers, int target) {
        this.count = 0;
        this.numbers = numbers;
        this.target = target;
        
        dfs(0, 0);
        
        return count;
    }
    
    public void dfs(int index, int sum) {
        if (index == numbers.length) {
            if (sum == target) {
                count++;
            }
            return;
        }
        
        dfs(index + 1, sum + numbers[index]);
        dfs(index + 1, sum - numbers[index]);
    }
}