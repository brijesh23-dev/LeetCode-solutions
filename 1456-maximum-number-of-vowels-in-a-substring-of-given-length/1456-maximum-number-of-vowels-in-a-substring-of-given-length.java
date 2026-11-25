class Solution {
    public int maxVowels(String s, int k) {
        //fixed window
        int vowelCount = 0;
        for (int left = 0; left < k; left++) {
            if (isVowel(s.charAt(left))) {
                vowelCount += 1;
            }
        }
        int maxVowel = vowelCount;

        //sliding window
        for (int right = k; right < s.length(); right++) {
            char incoming = s.charAt(right);
            char outgoing = s.charAt(right - k);
            if (isVowel(incoming)) {
                vowelCount += 1;
            }
            if (isVowel(outgoing)) {
                vowelCount -= 1;
            }

            maxVowel = Math.max(vowelCount, maxVowel);
        }

        return maxVowel;
    }

    public boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i'|| c=='o'|| c=='u';
    }
}