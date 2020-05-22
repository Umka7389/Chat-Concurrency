package Java2.HW3;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Homework_3 {


    public static void main(String[] args) {

        String inputText = "Here you can find activities to practise your reading skills Reading will help you to improve your understanding of the language and build your vocabulary";
        String[] array = inputText.toLowerCase().split(" ");

        HashSet<String> set = new HashSet<>(Arrays.asList(array));
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : array) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        System.out.println(map);
        System.out.println(set);
//----------------------------------------------------------------------//

        PhoneBook phoneBook = new PhoneBook();

        Person person1 = new Person("Иван","Иванов","+7901546859","ИванИванов@ya.ru", phoneBook);
        Person person2 = new Person("Виктор","Иванов","+79028546859","ВикторИванов@ya.ru", phoneBook);
        Person person3 = new Person("Петр","Петров","+7903546859","ПетрПетров@ya.ru", phoneBook);
        Person person4 = new Person("Николай","Петров","+7904546859","НиколайПетров@ya.ru", phoneBook);
        Person person5 = new Person("Илья","Костров","+7905546859","ИльяКостров@ya.ru", phoneBook);

        System.out.println(phoneBook.searchPhone("Иванов"));
        System.out.println(phoneBook.searchMail("Иванов"));

        System.out.println(phoneBook.searchPhone("Иванов"));
        System.out.println(phoneBook.searchMailHash("Иванов"));

    }
}
