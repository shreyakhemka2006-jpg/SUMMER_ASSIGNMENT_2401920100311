class Solution {
    public int maxSubArray(int[] nums) {
        /*BRUTE FORCE
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
        int sum=0;

            for (int j=i;j<n;j++){
                sum+=nums[j];
                max=Math.max(max,sum);
            }
        }
        return max;*/
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
           
            max=Math.max(sum,max);
             if(sum<0){
                sum=0;
            }
        }
        return max;

    }
}
