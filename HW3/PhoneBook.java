package Java2.HW3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    ArrayList<Person> personArrayList = new ArrayList<>();

    Person person1 = new Person("Иван","Иванов","+7901546859","ИванИванов@ya.ru", this);
    Person person2 = new Person("Виктор","Иванов","+79028546859","ВикторИванов@ya.ru", this);
    Person person3 = new Person("Петр","Петров","+7903546859","ПетрПетров@ya.ru", this);
    Person person4 = new Person("Николай","Петров","+7904546859","НиколайПетров@ya.ru", this);
    Person person5 = new Person("Илья","Костров","+7905546859","ИльяКостров@ya.ru", this);

    ArrayList<String> nameList = new ArrayList<>();

    public void setNameList(ArrayList<String> nameList) {
        this.nameList = nameList;
    }

    HashMap<String, ArrayList<String>> map = new HashMap<>();
    public void add (Person newPerson){
        personArrayList.add(newPerson);
    }


}
