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
    
    HashSet<Character> set=new  HashSet<>();
    for(int i=0;i<sentence.length();i++){
        char ch=sentence.charAt(i);
        if(!set.contains(ch)){
            set.add(ch);
        }
    }
    return set.size()==26;
    }

}