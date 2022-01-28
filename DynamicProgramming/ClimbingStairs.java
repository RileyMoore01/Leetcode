class Solution {
    public int climbStairs(int n) {
        if(n < 3) return n;   
        
        int[] arr = new int[n+1];   //This will be the returned result array
        Arrays.fill(arr, 0);        //Temporarily fill dp will 0's
        for(int i = 0; i < n; i++) {
            if(i-1 > -1){
                arr[i] += 1 + arr[i-1]; //Add another step course if past step exisit for one step progression
            } else if (i-2 > -1) {
                arr[i] += 1 + arr[i-2]; //Add another step course if the second previous step exisit for two step progression
            }
        }
        return arr[n-2]+2;
    }
}


//Bottom up approach
class Solution {
    public int climbStairs(int n) {
        int[] arr = new int[n+1];   //This will be the returned result array
        Arrays.fill(arr, 0);        //Temporarily fill dp will 0's
        int ans = countWays(arr, n);
        return ans;
    }
    
    public int countWays(int[] arr, int n) {
        if(n < 3) return n;   
        for(int i = 0; i < n; i++){
            arr[i] = arr[n-1] + arr[n-2];
        }
        return arr[n];
    }
}
