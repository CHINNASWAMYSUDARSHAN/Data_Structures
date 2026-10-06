class Solution {
    public int firstMissingPositive(int[] nums) {

        Arrays.sort(nums);
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int max=Collections.max(set);
        int i=1;
        if(max<0){
            return 1;
        }
        while(i<=max){
            if(!set.contains(i)){
                return i;
            }
            i++;
        }
        return max+1;
    }
}