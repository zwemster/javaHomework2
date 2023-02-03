import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class javaHomework2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println("Список случайных чисел: " + list);

        List<Integer> filteredList = removeEvenValues(list);
        System.out.println("Список с удалёнными чётными числами: " + filteredList);

        int minElement = getMin(filteredList);
        System.out.println("Минимальный элемент массива: " + minElement);

        int maxElement = getMax(filteredList);
        System.out.println("Максимальный элемент массива: " + maxElement);

    }

    public static List<Integer> removeEvenValues(List<Integer> list) {
        return list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
    }

    public static Integer getMin(List<Integer> list) {
        return list.stream().min(Integer::compareTo).orElse(0);
    }

    public static Integer getMax(List<Integer> list) {
        return list.stream().max(Integer::compareTo).orElse(0);
    }
}
