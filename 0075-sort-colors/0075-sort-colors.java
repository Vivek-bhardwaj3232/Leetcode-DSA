class Solution {
    public void sortColors(int[] nums) {
        int cntOne = 0;
        int cntZero = 0;
        int cntTwo = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                cntOne++;
            }else if (nums[i] == 0){
                cntZero++;
            }else{
                cntTwo++;
            }
        }
        int i = 0;
        while(cntZero > 0){
            nums[i] = 0;
            cntZero--;
            i++;
        }

        while(cntOne > 0){
            nums[i] = 1;
            cntOne--;
            i++;
        }

        while(cntTwo > 0){
            nums[i] = 2;
            cntTwo--;
            i++;
        }
    }
}