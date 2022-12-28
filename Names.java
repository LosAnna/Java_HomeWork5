import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Names {
    /*
     * Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
     */
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
            "Иван", "Светлана", "Кристина", "Анна", "Анна",
            "Иван", "Петр", "Павел", "Петр", "Мария",
            "Марина", "Мария", "Мария", "Марина", "Анна", "Иван", 
            "Петр", "Иван");
            
    Map<String, Long> names =
            list.stream().collect(Collectors.groupingBy(
                    Function.identity(), Collectors.counting()));
                    names.forEach((k, v) -> {
                  System.out.println(k + ": " + v);
                }); 
    
    }
    }