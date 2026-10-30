class Solution {
    public static int gcd(int a,int b){
        while(a!=0 && b!=0){
            if(a>b){
                a=a%b;
            }else{
                b=b%a;
            }
        }
        if(a==0){
            return b;
        }
        return a;
    }
    public int countBeautifulPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int first=nums[i];
                while(first >= 10) {
                    first = first / 10;
                }

                int last=nums[j]%10;
                if(gcd(first,last)==1){
                    count++;
                }
            }
        }
        return count;
    }
}