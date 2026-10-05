class Solution {
    public int numberOfSteps(int num) {
        int stepCount = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
                stepCount+=1;
            } else {
                num = num - 1;
                stepCount+=1;
            }
        }
        return stepCount;
    }
}