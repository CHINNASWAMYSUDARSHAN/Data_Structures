class Solution {
    public int hammingWeight(int n) {
        String str="";
        while(n!=0){
            int rem=n%2;
            str=rem+str;
            n=n/2;;
        }
        System.out.print(str);
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='1'){
                count++;
            }
        }
       return count;
    }
}