import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ Коллекции: сеты и мапы");
        task1();
        task2();
        task3();
        task4();
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

    public static void task2() {
        System.out.println("Задание 2");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        SortedSet<Integer> nums2 = new TreeSet<>(nums);
        for (Integer item : nums2) {
            if (item % 2 == 0) {
                System.out.println(item.toString());
            }
        }
    }

    public static void task3() {
        System.out.println("Задание 3");
        Set<String> strings = new HashSet<>(List.of("один", "два", "два", "три", "три", "три"));
        System.out.println(" " + strings.toString());
    }

    public static void task4() {
        System.out.println("Задание 4");
        List<String> strings = new ArrayList<>();
        strings.add("один");
        strings.add("два");
        strings.add("два");
        strings.add("три");
        strings.add("три");
        strings.add("три");

        Map<String, Integer> stringsTwo = new LinkedHashMap<>();
        for (String tempString : strings) {
            if (!stringsTwo.containsKey(tempString)) {
                stringsTwo.put(tempString, 1);
            } else {
                stringsTwo.put(tempString, stringsTwo.get(tempString) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : stringsTwo.entrySet()) {
            System.out.println(" " + entry.getKey() + ": \t" + entry.getValue());
        }
    }
}