class Solution {
    public static String decimalToBinary(int num){
        String s="";
        while(num>0){
            int rem=num%2;
            if(rem==0) {
            	s="1"+s;            	
            }else {
            	s="0"+s;
            }
            num=num/2;
        }        
        return s;
    }
	public static int binaryToDecimal(String str) {
		int res=0;
		int powerOf2=1;
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)=='1') {
				res=res+powerOf2;
			}
			powerOf2*=2;
		}
		
		return res;
	}
    public int findComplement(int num) {
        String str=decimalToBinary(num);
    	return binaryToDecimal(str);
       
    }
}