package t2018_12_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int y = input.nextInt();
        int g = input.nextInt();

        //总时间
        long time = 0;

        int instance = input.nextInt();
        int k,t;
        for (int i = 0; i < instance; i++) {
            k = input.nextInt();
            t = input.nextInt();
            switch (k) {
                case 0:
                    time += t;
                    break;
                case 1:
                    time += t;
                    break;
                case 2:
                    time += t + r;
                    break;
                case 3:
                    break;
            }
        }
        System.out.println(time);
    }
}
