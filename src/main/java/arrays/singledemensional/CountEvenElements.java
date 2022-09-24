package arrays.singledemensional;

import java.util.Date;

public class CountEvenElements {
    public static void main(String[] args) {
        int[] values = {12,435,46,65,768,68,67,8679,6,9,679,7,545,34,53,64634,7,67,567,
                6456,54,6,12,435,46,65,768,68,67,8679,6,9,679,7,545,34,53,64634,7,67,567,6456,54,6,
                12,435,46,65,768,68,67,8679,6,9,679,7,545,34,53,64634,7,67,567,6456,54,6,12,435,46,65,
                768,68,67,8679,6,9,679,7,545,34,53,64634,7,67,567,6456,54,6,12,435,46,65,768,68,67,8679,
                6,9,679,7,545,34,53,64634,7,67,567,6456,54,6,12,435,46,65,768,68,67,8679,6,9,679,7,545,3447
                ,53,64634,7,67,567,6456,54,6,12,435,46,65,768,68,67,8679,6,9,679,7,545,34,53,64634,7,67,
                567,6456,54,6,12,435,46,65,768,68,67,8679,6,9,679,7,545,34,53,64634,7,67,567,6456
                ,54,6,12,435,46,65,768,68,67,8679,6,9,679,7,545,34,53,64634,7,67,567,6456,54,6,12,
                435,46,65,768,68,67,8679,6,9,679,7,545,34,53,64634,7,67,567,6456,54,6,12,435,46,65,
                768,68,67,8679,6,9,679,7,545,34,53,64634,7,67,567,6456,54,6};
        long start = new Date().getTime();
        System.out.println(getEvenNumberCount(values));
        long end = new Date().getTime();
        System.out.println("total time : " + (end - start));

        start = new Date().getTime();
        System.out.println(getEvenNumberCount1(values));
        end = new Date().getTime();
        System.out.println("Optimized total time : " + (end - start));

    }

    static int getEvenNumberCount1(int[] values) {
        int count =0;
        for (int val : values) {
            if(optimizedEvenCount(val) % 2 == 0){
                count++;
            }
        }
        return count;
    }

    static int optimizedEvenCount(int val) {
        val = Math.abs(val);
        return (int) Math.log10(val) +1;
    }

    static int getEvenNumberCount(int[] values) {
        int count =0;
        for (int val : values) {
            if(evenCount(val)){
                count++;
            }
        }
        return count;
    }

    static boolean evenCount(int value) {
        if(value < 0){
            value = Math.abs(value);
        }
        return getCount(value) % 2 == 0;
    }

    private static int getCount(int value) {
       int count = 0;
        while(value >0) {
            count++;
            value = value/10;
        }
        return count;
    }
}
