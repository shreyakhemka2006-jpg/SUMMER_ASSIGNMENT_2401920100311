class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n=nums.length;
        int[] ans=new int[2];
        /*BRUTE FORCE
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;*/
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(target-nums[i])){
                ans[0]=map.get(target-nums[i]);
                ans[1]=i;
            }
            map.put(nums[i],i);
        }
        return ans;
        
    }
}
