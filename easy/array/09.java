class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] tmp=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if((i!=j)&&(nums[i]+nums[j])==target){
                    if(i<j){
                       tmp[0]=i;
                       tmp[1]=j;
                    }else{
                       tmp[1]=i;
                       tmp[0]=j;                   
                    }
                }
            }
        }
        return tmp;
    }

}