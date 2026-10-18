class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0,copy=x;
        while(x!=0){
            int rem=x%10;
            sum+=rem;
            x/=10;
        }
        if(copy%sum==0){
            return sum;
        }
        return -1;
        
    }
}