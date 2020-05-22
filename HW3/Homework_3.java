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
    }
}
