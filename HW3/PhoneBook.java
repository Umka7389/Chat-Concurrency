package Java2.HW3;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    ArrayList<Person> personList = new ArrayList<>();
    ArrayList<String> phoneNumberList = new ArrayList<>();
    ArrayList<String> mailList = new ArrayList<>();

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
