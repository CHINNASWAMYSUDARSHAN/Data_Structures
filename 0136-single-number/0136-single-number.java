import java.util.Arrays;
class Solution{
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int val=nums[0];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && i!=j){
                    count++;
                }
            }
            if(count==0){
                val=nums[i];
                break;
            }
        }
    return val;
    }
}