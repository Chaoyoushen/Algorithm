class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length==0||nums2.length==0) {
            return new int[0];
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list=new ArrayList();
        for(int n:nums1){
            if(map.get(n)==null){
                map.put(n,1);
            }else{
                map.put(n,map.get(n)+1);
            }
        }
        for(int m:nums2){
            if(map.get(m)!=null&&map.get(m)>0){
                list.add(m);
                map.put(m,map.get(m)-1);
            }
        }
        int[] res=new int[list.size()];
        int i=0;
       for (Integer e : list){
            res[i++] = e;
       }
        return res;
    }
}