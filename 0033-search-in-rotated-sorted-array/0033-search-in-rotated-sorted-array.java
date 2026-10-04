class Solution {
    public int search(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
           list.add(nums[i]);
        }
        if(list.indexOf(target)!=-1){
            return list.indexOf(target);
        }
        return -1;
    }
}