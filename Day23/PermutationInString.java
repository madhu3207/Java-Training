package Day23;

public class PermutationInString {

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        int[] count = new int[26];

        for (char c : s1.toCharArray())
            count[c - 'a']++;

        int left = 0;
        int right = 0;
        int required = s1.length();

        while (right < s2.length()) {

            if (count[s2.charAt(right) - 'a']-- > 0)
                required--;

            right++;

            if (required == 0) {
                System.out.println(true);
                return;
            }

            if (right - left == s1.length()) {

                if (count[s2.charAt(left) - 'a']++ >= 0)
                    required++;

                left++;
            }
        }

        System.out.println(false);
    }
}
