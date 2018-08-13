class Solution {
    public void rotate(int[] nums, int k) {
        if(k==0){
            return;
        }
        int tmp=k%nums.length;
        int temp=0;
        for(int i=0;i<tmp;i++){ 
            temp=nums[nums.length-1];
            for(int j=nums.length-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0]=temp;
        }
        return;
    }
}