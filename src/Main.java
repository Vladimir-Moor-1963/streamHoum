import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));



        }
        System.out.println(numbers);

        List<Integer> newNambers = numbers.stream()
                .map(x -> x + 15)
                .filter(x-> x >50)
                .toList();
        System.out.println(newNambers);

    Object sum = newNambers.stream().reduce((x, y) -> x + y);
        System.out.println(sum);
}
}
