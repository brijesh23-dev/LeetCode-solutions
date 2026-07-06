class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            int key = nums[i];
            for (int j = 0; j < n; j++) {
                if (nums[j] == key) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                return key;
            }
        }
        return -1;
    }
}