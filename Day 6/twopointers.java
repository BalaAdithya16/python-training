class twopointers{
    public static boolean isPalindrome(String s) {
        String a="";
        String b="";
        String d="";
        boolean c=false;
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))||Character.isDigit(s.charAt(i))){
                a+=s.charAt(i);
            }
        }
        d=a.toLowerCase();
        for(int i=d.length()-1;i>=0;i--){
            b+=d.charAt(i);
        }
        
        if(b.equals(d)){
            c=true;
        }
        return c;
    }
    public static void main(String[] args){
        String s= "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}