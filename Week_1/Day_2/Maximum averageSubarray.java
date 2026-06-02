class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxSum=sum;
        for(int j=k;j<n;j++){
            sum=sum-nums[j-k]+nums[j];
            maxSum=Math.max(sum,maxSum);
        }
        return maxSum/k;
    }
}
