class Solution {
    public int maxArea(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int max = 0;
        while(left<right){
            int height = Math.min(nums[left],nums[right]);
            int width = right-left;
            int water = height*width; 
            max = Math.max(water,max);
            if(nums[left] < nums[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}