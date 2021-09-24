public class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int tribonacci_nums[] = new int[n+1];
        tribonacci_nums[0] = 0;
        tribonacci_nums[1] = 1;
        tribonacci_nums[2] = 1;
        for(int i=3; i<=n; i++){
            tribonacci_nums[i] = tribonacci_nums[i-1] + tribonacci_nums[i-2] + tribonacci_nums[i-3];
        }
        return tribonacci_nums[n];
     }
}
