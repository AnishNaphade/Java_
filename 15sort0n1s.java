class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
int index1 = 0;
int index2 = 0;
        while(left<right){
            int sum = nums[left] + nums[right];

            if(sum == target){
                index1 = left + 1;
                index2 = right + 1;
                return new int[]{index1, index2};
            }

           else if(sum < target){
                left++;
            }
            else {
                right--;
            }
        }
          return new int[]{index1, index2};
        
    } 
}
