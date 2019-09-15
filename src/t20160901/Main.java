package t20160901;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            nums[i] = input.nextInt();
        }

        int max = 0;
        int temp = 0;
        for (int i = 0; i < count-1; i++) {
            temp = Math.abs(nums[i] - nums[i + 1]);
            if (temp>max) {
                max = temp;
            }
        }
        System.out.println(max);
    }
}
