package t20160401;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int[] sale = new int[count];
        for (int i = 0; i < count;i++) {
            sale[i] = input.nextInt();
        }

        if (count <= 2) {
            System.out.println(0);
            return;
        }

        int point = 0;
        for (int i = 1; i < count - 1; i++) {
            if (sale[i] < sale[i - 1] && sale[i] < sale[i + 1]) {
                point++;
            } else if (sale[i] > sale[i - 1] && sale[i] > sale[i + 1]) {
                point++;
            }
        }
        System.out.println(point);
    }
}
