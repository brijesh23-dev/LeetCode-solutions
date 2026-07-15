import java.util.ArrayList;

class Solution {

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public static void mergeSort(int[] arr, int low, int high) {

        if (low >= high)
            return;

        int mid = low + (high - low) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {

        ArrayList<Integer> al = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {
                al.add(arr[left]);
                left++;
            } else {
                al.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            al.add(arr[left]);
            left++;
        }

        while (right <= high) {
            al.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = al.get(i - low);
        }
    }
}