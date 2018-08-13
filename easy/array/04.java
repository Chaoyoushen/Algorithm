class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> tmp=new HashMap<>();
        for(int n:nums){
            if(tmp.put(n,n)!=null){
                return true;
            }
        }
    
        return false;
    }
}