import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] nums = {1.1, -2.2, 3.3, -4.4, 5.5, -6.6, 7.7, 8.8, 9.9, -10.0, 11.1, 12.2, -13.3, 14.4, -15.5};

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i - 1]) {
                    isSorted = false;
                    double sum = nums[i];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = sum;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }
    }
