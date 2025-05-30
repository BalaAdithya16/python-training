import java.util.*;
public class DPtabulation{
    static int BottomUp(int n){
        int dp[]=new int[n+1];
        dp[0]=0;//base cases
        dp[1]=1;//base cases
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(BottomUp(n));
        sc.close();
    }
}