public class Main{
    public boolean static ValidPalindrome(String s){
        String fixed_str = "";
        for(char c: s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                fixed_str += c;
            }
        }
        fixed_str = fixed_str.toLowerCase();
        int a = 0;
        int b = fixed_str.length()-1;
        while(a <= b){
            if(fixed_str.charAt(a) != fixed_str.charAt(b)){
                return false;
            }
            a = a+1;
            b = b-1;
        }
        return true;
    }
}
