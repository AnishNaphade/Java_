class Solution {
    public boolean search(int[] nums, int target) {
        int ans = -1;
boolean statement = false;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == target){
               statement =  true;
               break;
            }
            else{
              statement =   false;
            }
        }
return statement;
    }
}