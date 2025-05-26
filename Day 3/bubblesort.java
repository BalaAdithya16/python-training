public class bubblesort{
    public static void main(String args[]){
        int[] arr={30,3,2,23,999};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

// Bubble sort is a implace and stable algorithm it is suitable for upto 100 or 150 elements.

// time complexity
// best case: O(n)
// Avearge case: O(n^2)
// worst case: O(n^2)

// space complexity:O(n)


// optimized bubble sort

// public class bubblesort{
//     public static void main(String args[]){
//         int[] arr={30,3,2,23,999};
//         boolean b=false;
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                     b=true;
//                 }
//             }
//             if(!b){
//                 break;
//             }
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }