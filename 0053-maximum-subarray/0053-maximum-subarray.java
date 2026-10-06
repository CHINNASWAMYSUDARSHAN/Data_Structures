class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        dp[0]=nums[0];
        for(int i=1;i<n;i++){
            int value=dp[i-1]+nums[i];
            dp[i]=value>nums[i]?value:nums[i];
        }
        int max=dp[0];
        for(int i=0;i<n;i++){
            max=dp[i]>max?dp[i]:max;
        }
        return max;
        
    }
}