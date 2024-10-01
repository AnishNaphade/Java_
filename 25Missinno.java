class Solution {
    public int missingNumber(int[] nums) {
//actual sum - currsum = missing number

//sum for range 0 to n is n(n+1)/2

int n = nums.length;

int actualsum = n*(n+1)/2;
int currsum = 0;



        for(int i = 0; i<nums.length;i++){
currsum = currsum + nums[i];
        }

        int missingno = actualsum - currsum;

        return missingno;
    }
}