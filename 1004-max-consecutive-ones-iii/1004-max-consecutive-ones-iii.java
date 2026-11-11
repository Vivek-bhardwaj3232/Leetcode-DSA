class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int cntZero = 0;
        for(int right=0; right<n; right++){
            if(nums[right] == 0){
                cntZero++;
            }
            if(cntZero > k){
                if(nums[left] == 0){
                    cntZero--;
                }
                left++;
            }
        }
        return n-left;
    }
}