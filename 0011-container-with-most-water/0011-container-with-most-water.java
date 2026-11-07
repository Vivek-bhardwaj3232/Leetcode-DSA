class Solution {
    public int maxArea(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int max = 0;

        while(l<r){
            int h = Math.min(nums[l],nums[r]);
            int w = r-l;
            int area = h*w;
            max = Math.max(area,max);
            if(nums[l] < nums[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}