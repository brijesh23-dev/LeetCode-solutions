class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / k;
        if (avg >= threshold) {
            count++;
        }
        for (int i = k; i < n; i++) {
            sum = sum - arr[i - k] + arr[i];
            avg = (double) sum / k;
            if (avg >= threshold) {
                count++;
            }
        }
        return count;
    }
}