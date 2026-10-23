class Solution {
    public boolean checkIfPangram(String sentence) {
        
    //   String p="abcdefghijklmnopqrstuvwxyz";
    //   for(int i=0;i<p.length();i++){
    //     boolean value=false;
    //     for(int j=0;j<sentence.length();j++){
    //         if(p.charAt(i)==sentence.charAt(j)){
    //             value=true;
    //         }
    //     }
    //     if(value==false){
    //         return false;
    //     }
    //   }  
    //     return true;
    
    // the sum from 97 to 122 is 2847 by using formula sum=(n/2)(a+l)
    HashSet<Character> set=new  HashSet<>();
    int sum=0;
    for(int i=0;i<sentence.length();i++){
        char ch=sentence.charAt(i);
        if(!set.contains(ch)){
            set.add(ch);
            sum+=ch;
        }
    }
    return sum==2847;
    }

}