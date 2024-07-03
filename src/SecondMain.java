import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SecondMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        System.out.println("Введите кол.  строк");
        int namberString = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите строки");
        for (int i = 0; i < namberString; i++) {
            strings.add(scanner.nextLine());
        }
        List<Integer> lengths = strings.stream()


                .map(String::length)
                .filter(length -> length >= 15)
                .collect(Collectors.toList());
        System.out.println(lengths);

    }


}


