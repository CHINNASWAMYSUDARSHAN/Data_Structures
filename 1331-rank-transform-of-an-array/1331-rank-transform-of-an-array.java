class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int copy[]=Arrays.copyOf(arr,arr.length);
        int res[]=new int[arr.length];
        Arrays.sort(arr);
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],count);
                count++;
            }
        }
        for(int i=0;i<copy.length;i++){
            res[i]=map.get(copy[i]);
        }

        return res;
        
    }
}