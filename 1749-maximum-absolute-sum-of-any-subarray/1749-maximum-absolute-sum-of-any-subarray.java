class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max = 0;
        int min = 0;
        int cs = 0;
        for(int i=0; i<nums.length; i++){
            cs += nums[i];
            max = Math.max(max,cs);
            min = Math.min(min,cs);
        }
        return max-min;
    }
}