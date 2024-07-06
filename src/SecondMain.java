import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
        Optional<String> lengths = strings.stream()



                .filter(str ->str.length()<=15)
                        .max(String::lastIndexOf);
                //.collect(Collectors.toList());

        System.out.println(lengths);

    }


}


