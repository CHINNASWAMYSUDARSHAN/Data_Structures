class Solution {
    public boolean canAliceWin(int n) {
        int i=10,count=0;
        while(n>0){
            n=n-i;
            i--;
            if(n!=0){
            count++;
            }
        }
        return count%2==0;

    }

}