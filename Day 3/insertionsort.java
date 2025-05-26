// insertion sort is a implace and stable algorithm and not suitable for large sets

// Time complexity:
// B.C:O(n)
// A.C:O(n^2)
// W.C:O(n^2)

// space complexity:O(1)

class insertionsort {
    public static void main(String args[]) {
        int[] arr = {30, 3, 2, 23, 999};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
