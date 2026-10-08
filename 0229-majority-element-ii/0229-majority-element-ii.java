class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int range=nums.length/3;
        List<Integer> list =new ArrayList<>();
        for(Map.Entry<Integer,Integer> ele:map.entrySet()){
            if(ele.getValue()>range){
                list.add(ele.getKey());
            }
        }
        return list;

    }
}