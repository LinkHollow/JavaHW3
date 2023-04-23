//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class task03 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");
        String[] planets = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон"};
        ArrayList<String> planetsList = createPlanetList(planets, 20);
        System.out.println(planetsList);
        for (String planet : planets) {
            System.out.printf("%s\t %d\n", planet, Collections.frequency(planetsList, planet));
        }
    }

    static ArrayList<String> createPlanetList(String[] items, int capacity) {
        Random rnd = new Random();
        ArrayList<String> res = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            int index = rnd.nextInt(0, 8);
            res.add(items[index]);
        }
        return res;
    }
}