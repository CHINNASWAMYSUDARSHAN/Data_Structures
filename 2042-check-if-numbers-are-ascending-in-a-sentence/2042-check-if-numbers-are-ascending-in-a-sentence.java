class Solution {
    public boolean areNumbersAscending(String s) {
        String[] arr=s.split("\\D+");
        int res[]=new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(!arr[i].isEmpty()){
            int current=Integer.parseInt(arr[i]);
            res[count]=current;
            count++;
            }
        }
        for(int i=1;i<count;i++){
            if(res[i-1]>=res[i]){
                return false;
            }
        }


        return true;




        
    }
}