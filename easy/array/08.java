class Solution {
    public void moveZeroes(int[] nums) {
        if(nums==null){
            return;
        }
        int rea=0;
        for(int n=0;n<nums.length;n++){
            if(nums[n]!=0){
                nums[rea]=nums[n]; 
                if(rea!=n){
                    nums[n]=0;
                }
                rea++;
            }
        }
    }
}