class Solution {
    public static int convert(String str){
      int num=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            num=num*10+(ch-97);
        }
        return num;
    }
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int first=convert(firstWord);
        int second=convert(secondWord);
        int target=convert(targetWord);
        return (first+second)==target;
    }
}