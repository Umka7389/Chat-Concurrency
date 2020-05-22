package Java2.HW3;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    ArrayList<Person> personList = new ArrayList<>();
    ArrayList<String> phoneNumberList = new ArrayList<>();
    ArrayList<String> mailList = new ArrayList<>();

    Person person1 = new Person("Иван","Иванов","+7901546859","ИванИванов@ya.ru", this);
    Person person2 = new Person("Виктор","Иванов","+79028546859","ВикторИванов@ya.ru", this);
    Person person3 = new Person("Петр","Петров","+7903546859","ПетрПетров@ya.ru", this);
    Person person4 = new Person("Николай","Петров","+7904546859","НиколайПетров@ya.ru", this);
    Person person5 = new Person("Илья","Костров","+7905546859","ИльяКостров@ya.ru", this);

    public ArrayList<String> searchPhone (String surname){
        phoneNumberList.clear();
        for (Person p: personList
             ) {
            if (p.getSurname() == surname){
            phoneNumberList.add(p.getPhoneNumber());
            }
        }
    return phoneNumberList;
    }

    public ArrayList<String> searchMail (String surname){
        mailList.clear();
        for (Person p: personList
        ) {
            if (p.getSurname() == surname){
                mailList.add(p.getMail());
            }
        }
        return mailList;
    }

    HashMap<String, ArrayList<String>> map = new HashMap<>();

    public void add (Person newPerson){
        personList.add(newPerson);
    }


}
