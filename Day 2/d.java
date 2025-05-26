// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static int[] plusOne(int[] digits) {
        double c=0;
        double mul=1;
        for(int i=digits.length-1;i>=0;i--){
            c+=digits[i]*mul;
            mul*=10;
            System.out.println(c);
        }
        c+=1;
        System.out.println(c);
        int z=String.valueOf(Math.abs(c)).length();
        int[] ndigits=new int[z];
        int n=ndigits.length-1;
        while(c>0){
            int rem=c%10;
            ndigits[n]=rem;
            n-=1;
            c/=10;
        }
        return ndigits; 
    }
    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        int[] ans=new int[digits.length];
        ans=plusOne(digits);
        System.out.println(Integer.MAX_VALUE);
        // for(int i=0;i<ans.length;i++){
        // System.out.println(ans[i]);
    // }
    }
}