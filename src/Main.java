import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));



        }
        System.out.println(numbers);

        List<Integer> newNambers = Collections.singletonList(numbers.stream()
                .map(x -> x + 15)
                .filter(x -> x > 50)
                .reduce((x, y) -> x + y)
                .orElse(0));

               // .toList();
        System.out.println(newNambers);

  // Object sum = newNambers.stream().reduce((x, y) -> x + y);
  //     System.out.println(sum);
}
}
