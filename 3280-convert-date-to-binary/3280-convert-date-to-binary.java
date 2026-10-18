class Solution {
    public static String binary(int num){
        String str="";
        while(num!=0){
            int rem=num%2;
            str=rem+str;
            num/=2;
        }
        return str;
    }
    public String convertDateToBinary(String date) {
        String res="";
        String[] ch=date.split("-");
        for(int i=0;i<ch.length;i++){
            int num=Integer.parseInt(ch[i]);
            res=res+binary(num)+"-";
        }
    return res.substring(0,res.length()-1);
    }
}