//Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Random;


public class task01 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");
        int size = randomNum(5, 20);
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            nums.add(randomNum(0, 99));
        }
        System.out.println("Изначальный список:");
        System.out.println(nums);
        nums.removeIf(n -> n % 2 == 0);
        System.out.println("Отфильтрованный список:");
        System.out.println(nums);
    }

    public static int randomNum(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
