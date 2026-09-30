    class Solution {
        public static int gcd(int a,int b){
            while(a!=b){
                if(a>b){
                    a=a-b;
                }
                else{
                    b=b-a;
                }
            }
            return a;
        }
        public String gcdOfStrings(String str1, String str2) {
            if(!(str1+str2).equals(str2+str1))return "";
            int gcd=gcd(str1.length(),str2.length());
            return str1.substring(0,gcd);
        }
    }