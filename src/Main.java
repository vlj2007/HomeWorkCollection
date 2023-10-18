import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ Коллекции: сеты и мапы");
        task1();
    }

    public static void task1() {
        System.out.println("Задание 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer item : nums) {
            if (item % 2 != 0) {
                System.out.println(item);
            }
        }
    }



}