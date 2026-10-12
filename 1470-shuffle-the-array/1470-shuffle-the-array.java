class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[nums.length];
        int count=0;
        for(int i=0;i<n;i++){
            arr[count]=nums[i];
            count++;
            arr[count]=nums[n+i];
            count++;
        }
        return arr;

        
    }
}