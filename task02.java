//Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметическое из этого списка.
// Collections.max()

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class task02 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");
        int size = randomNum(10, 30);
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            nums.add(randomNum(0, 999));
        }
        System.out.println(nums);
        System.out.printf("Максимальное: %d", Collections.max(nums));
        System.out.println();
        System.out.printf("Минимальное: %d", Collections.min(nums));
        System.out.println();
        System.out.printf("Среднее арифмитическое: %f", averageInt(nums));

    }

    public static int randomNum(int min, int max) {
        Random num = new Random();
        return num.nextInt((max - min) + 1) + min;
    }

    public static double averageInt(ArrayList<Integer> lst) {
        double summ = 0;
        for (int i : lst) {
            summ += i;
        }
        return summ / lst.toArray().length;
    }

}