class Solution {
    public int hammingWeight(int n) {
        // String str="";
        int count=0;
        while(n!=0){
            count+=n%2;
            // str=rem+str;
            n=n/2;;
        }
        return count;
    //     System.out.print(str);
    //     int count=0;
    //     for(int i=0;i<str.length();i++){
    //         char ch=str.charAt(i);
    //         if(ch=='1'){
    //             count++;
    //         }
    //     }
    //    return count;
    }
}