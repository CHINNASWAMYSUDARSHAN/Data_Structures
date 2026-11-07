class Solution {
    public static void reverse(int arr[],int low,int high){
        while(low<high){
            arr[low]=arr[low]^arr[high];
            arr[high]=arr[low]^arr[high]; 
            arr[low]=arr[low]^arr[high];
            low++;
            high--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        if(k<0){
            k=k+n;
        }
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
}