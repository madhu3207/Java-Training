package Day23;

public class MaximumAverageSubarray {

    public static void main(String[] args) {

        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        double maxSum = 0;

        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }

        double windowSum = maxSum;

        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            if (windowSum > maxSum)
                maxSum = windowSum;
        }

        System.out.println("Maximum Average = " + (maxSum / k));
    }
}
