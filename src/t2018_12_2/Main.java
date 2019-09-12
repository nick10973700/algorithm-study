package t2018_12_2;

import java.util.*;

public class Main {
    public static int r;
    public static int y;
    public static int g;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        y = input.nextInt();
        g = input.nextInt();
        int instance = input.nextInt();

        //总时间
        long time = 0;
        List<Map<Integer, Long>> mapList = new ArrayList<>();
        Map<Integer, Long> integerMap = null;
        for (int i = 0; i < instance; i++) {
            int k = input.nextInt();
            long t = input.nextInt();
            integerMap = new HashMap<>();
            integerMap.put(k, t);
            mapList.add(integerMap);
        }
        input.close();

        for (int i = 0; i < instance; i++) {
            int k = mapList.get(i).keySet().iterator().next();
            long t = mapList.get(i).get(k);
            switch (k) {
                case 0:
                    time = time + t;
                    break;
                case 1:
                    time = time + t;
                    break;
                case 2:
                    time = time + t + r;
                    break;
                case 3:
                    break;
            }
            if (i != instance - 1) {
                k = mapList.get(i + 1).keySet().iterator().next();
                t = mapList.get(i + 1).get(k);
                switch (k) {
                    case 0:
                        break;
                    default:
                        t = t - (time%(r+y+g));
                        replaceLamp(mapList.get(i + 1), k, t);
                        break;
                }
            }
        }

        System.out.println(time);
    }

    public static void replaceLamp(Map<Integer, Long> integerMap, int k, long t) {
        while (t <= 0) {
            switch (k) {
                case 0:
                    break;
                case 1:
                    k = 3;
                    t += g;
                    break;
                case 2:
                    k = 1;
                    t += r;
                    break;
                case 3:
                    k = 2;
                    t += y;
                    break;
            }
        }
        integerMap.clear();
        integerMap.put(k,t);
    }
}
