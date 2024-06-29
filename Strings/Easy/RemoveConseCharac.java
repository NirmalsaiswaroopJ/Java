class Solution{
    public String removeConsecutiveCharacter(String S){
        String temp = ""+ S.charAt(0);
        for(int i = 1; i< S.length();i++){
            if(S.charAt(i) != S.charAt(i-1)){
                temp += S.charAt(i);
            }
        }
        return temp;
    }
}
