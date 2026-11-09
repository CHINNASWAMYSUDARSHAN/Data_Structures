class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        int res=-1;
        for(Map.Entry<Integer,Integer>x:map.entrySet()){
            if(x.getKey().intValue()==x.getValue().intValue()&& x.getKey()>res){
                res=x.getKey();
            }
        }
        return res;
        
    }
}