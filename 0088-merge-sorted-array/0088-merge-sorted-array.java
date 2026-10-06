class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1; //pointer 1 to nums1 from last
        int j = n - 1; //pointer 2 to nums2 from last
        int k = m + n - 1; //last index of nums1. use it for update values
        //i=m->0 and j = n->0
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}