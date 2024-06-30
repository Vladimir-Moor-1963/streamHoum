import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecondMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();
        System.out.println("Введите кол.  строк");
        int namberString = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите строки");
        List<Integer> str = strings.stream()
                .map(strg -> strg.length())
                .filter(integer -> integer>=15)
                .toList();
        System.out.println(str);








    }

}
