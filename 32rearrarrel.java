class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];

        int posindex = 0;
        int negaindex = 1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0 ){
                ans[posindex] = nums[i];
                posindex = posindex + 2;
            }
            if(nums[i] < 0){
                ans[negaindex] = nums[i];
                negaindex = negaindex + 2;
            }
        }

        return ans;
        
    }
}