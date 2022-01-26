class Solution {
    public int fib(int n) {
        if(n <= 1)
            return n;

        int prev2 = 0;      //taking first two numbers of
        int prev1 = 1;      //series as 0 and 1 by default
        int num = 0;
        for(int i=2; i<=n; i++)
        {
            num = prev2 + prev1;    //since each no. is sum of two preceding ones
            prev2 = prev1;          //updating values of prev2 & prev1
            prev1 = num;
        }
        return num;
    }
}
