import java.util.Arrays;
class Solution {
    public int majorityElement(int[] nums) {
    //     Arrays.sort(nums);
    //    int val=nums[0],count2=0;
    //    for(int i=0;i<nums.length;i++){
    //     int count=0;
    //     for(int j=i;j<nums.length;j++){
    //         if(nums[i]==nums[j]){
    //             count++;
    //         }
    //     }
    //     if(count>count2){
    //         count2=count;
    //         val=nums[i];
    //     }
    //    }
    //    return val;


        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        int n=nums.length;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>n/2){
                return e.getKey();
            }
        }

        return -1;
        

    }
}