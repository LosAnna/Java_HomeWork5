import java.util.HashMap;
import java.util.Map;

public class Phone_book {
/*
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */
    public static void main(String[] args) {
        Map<String, String> bookPhone = new HashMap<>();
        bookPhone.put("Петров", "456-102, 546-204");
        bookPhone.put("Сидорова", "963-305");
        bookPhone.put("Денисов", "741-852");
        bookPhone.put("Иванова", "301-258, 645-951");

        System.out.println("Телефонная книга: \n" + bookPhone);

        add(bookPhone, "Любимов", "951-357");
        System.out.println("После добавления: \n" + bookPhone);

        remove(bookPhone, "Петров");
        System.out.println("После удаления: \n" + bookPhone);
    }

    public static void add(Map<String, String> note, String name, String num){
        note.put(name, num);
    }

    public static void remove(Map<String, String> note, String name){
        note.remove(name);
    }
}