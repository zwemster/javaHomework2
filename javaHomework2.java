import java.util.ArrayList;
import java.util.List;

public class javaHomework2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println("Список случайных чисел: " + list);
    }
}
