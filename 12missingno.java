class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

int currsum = 0;
int actualsum = 0;

         actualsum = n*(n+1)/2;
        for(int i=0; i<nums.length;i++){
             currsum = currsum + nums[i];
        }

        int ans;
        ans = actualsum - currsum;

        return ans;

        
    }
}