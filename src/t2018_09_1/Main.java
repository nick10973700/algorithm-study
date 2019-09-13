package t2018_09_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int shopCount = input.nextInt();
        int[] currentPrice = new int[shopCount];
        int[] tomorrowPrice = new int[shopCount];
        for (int i = 0; i < shopCount; i++) {
            currentPrice[i] = input.nextInt();
        }

        for (int i = 0; i < shopCount; i++) {
            if (i == 0) {
                tomorrowPrice[i] = (currentPrice[i] + currentPrice[i + 1]) / 2;
            } else if (i == shopCount - 1) {
                tomorrowPrice[i] = (currentPrice[i] + currentPrice[i - 1]) / 2;
            } else {
                tomorrowPrice[i] = (currentPrice[i - 1] + currentPrice[i] + currentPrice[i + 1]) / 3;
            }
        }
        for (int price : tomorrowPrice) {
            System.out.print(price+" ");
        }
    }
}
