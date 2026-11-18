class Solution {
    public boolean isFascinating(int n) {
        String str=""+n+(n*2)+(n*3);
        char[] arr=str.toCharArray();
         if(arr.length != 9) return false;
        Arrays.sort(arr);
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(count!=arr[i]-48){
                return false;
            }
            count++;
        }
        
        return true;
    }
}