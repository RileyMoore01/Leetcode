class Solution {
    public int climbStairs(int n) {
        if(n >= 0 && n <=3) return n;
        
        int[] dp = new int[n+1];
        Arrays.fill(dp,0);
        for(int i =0;i<n;i++ ){
            if (i-1 > -1){
                dp[i] += 1+dp[i-1];
            }
            if (i-2 > -1){
               dp[i] += 1+ dp[i-2]; 
            }
            
        }
        return dp[n-2]+2;
    }
}
