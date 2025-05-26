public class EvenOddsort{
    public static void main(String args){
        int arr[]={1,2,3,4,5,6};
        for(int i=0;i<nums.length-1;i++){
            if(arr[i]%2!=0){
                for(int j=i+1;j<nums.length;j++){
                    if(arr[j]%2==0){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}