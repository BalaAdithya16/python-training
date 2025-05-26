// if array has only 3 elements or with repitition, we can use this algorithm

public class DutchNationalFlag{
    static void Sort(int[] nums){
        int n=nums.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }

    public static void main(String[] args){
        int arr={2,0,2,1,1,0};
        Sort(arr);
        for(int i:arr){
            System.out.println(arr);
        }
        
    }
}