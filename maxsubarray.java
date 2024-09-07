class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=nums[0];
        int currsum=nums[0];

        for(int i=1; i<nums.length; i++){
            currsum = Math.max(nums[i], currsum + nums[i]);

           maxsum = Math.max(maxsum,currsum);
        }
        
return maxsum;
    }
    
}