package t20170901;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int money = input.nextInt();
        int soy = 0;

        while (money != 0) {
            int count = 0;
            if ((money / 50) >= 1) {
                count = money/50;
                money = money - 50 * count;
                soy = soy + 5 * count + 2 * count;
            } else if ((money / 30) >= 1) {
                count = money/30;
                money = money - 30 * count;
                soy = soy + 3 * count + 1 * count;
            }else{
                count = money / 10;
                money = money - 10 * count;
                soy = soy + 1 * count;
            }
        }

        System.out.println(soy);
    }
}
