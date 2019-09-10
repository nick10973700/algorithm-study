package t2019_03_1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            nums[i] = input.nextInt();
        }

        int max, min;
        if (nums[0] > nums[count - 1]) {
            max = nums[0];
            min = nums[count - 1];
        } else {
            max = nums[count - 1];
            min = nums[0];
        }

        if (count % 2 == 0) {
            double mid = new BigDecimal((nums[count / 2 - 1] + nums[count / 2])/2.0).setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();
            if (mid - (int) mid == 0) {
                System.out.println(max + " " + (int) mid + " " + min);
            } else {
                System.out.println(max+" "+mid+" "+min);
            }
        } else {
            int mid = nums[(count - 1) / 2];
            System.out.println(max+" "+mid+" "+min);
        }
    }
}
