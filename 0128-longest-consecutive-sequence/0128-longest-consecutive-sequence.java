class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }        
        int max=0;
        for(Integer i:set){
            if(!set.contains(i-1)){
                int start=i;
                int count=0;
                while(set.contains(i)){
                    count++;
                    i++;
                }
                if(count>max){
                    max=count;
                }
            }
        }
        return max;

    }
}