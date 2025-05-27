public class binarysearch{
    public static boolean judgeSquareSum(int c) {
        int l=0;
        int r=c;
        while(l<=r){
            int mid=l+(r-l)/2;
            System.out.println(mid);
            for(int i=0;i<=mid;i++){
                if(Math.pow(i,2)+Math.pow(mid,2)==c){
                    return true;
                }
            }
            if(Math.pow(mid,2)>c){
                r=mid-1;
                System.out.println(r);
            }
            else{
                l=mid+1;
                System.out.println(l);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int c=16;
        System.out.println(judgeSquareSum(c));
    }
}