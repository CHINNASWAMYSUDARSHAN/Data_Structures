class Solution {
    
    public int maxProduct(int n) {
        // int len=0;
        // int num=n;
        // while(num!=0){
        //     num/=10;
        //     len++;
        // }
        // int arr[]=new int[len];
        // int count=0;
        // while(n!=0){
        //     arr[count]=n%10;
        //     n/=10;
        //     count++;
        // }
        // Arrays.sort(arr);
        // return arr[arr.length-1]*arr[arr.length-2];

        int first=0,second=0;
        while(n!=0){
            int rem=n%10;
            if(rem>first){
                second=first;
                first=rem;
            }
            else if(rem>second){
                second=rem;
            }
            n/=10;
        }
        return first*second;
        
        
    }
}