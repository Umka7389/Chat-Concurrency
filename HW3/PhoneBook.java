package Java2.HW3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    ArrayList<Person> personList = new ArrayList<>();
    ArrayList<String> phoneNumberList = new ArrayList<>();
    ArrayList<String> mailList = new ArrayList<>();
    HashMap<String, String> mapPhone = new HashMap<>();
    HashMap<String, String> mapMail = new HashMap<>();


    public ArrayList<String> searchPhoneHash (String surname){
        ArrayList<String> output = new ArrayList<>();
        for (Map.Entry<String,String> e: mapPhone.entrySet()
             ) {
            if (e.getKey().startsWith(surname)){
                output.add(mapPhone.get(e.getKey()));
            }
        }
        return output;
    }
    public ArrayList<String> searchMailHash (String surname){
        ArrayList<String> output = new ArrayList<>();
        for (Map.Entry<String,String> e: mapMail.entrySet()
        ) {
            if (e.getKey().startsWith(surname)){
                output.add(mapMail.get(e.getKey()));
            }
        }
        return output;
    }

    public ArrayList<String> searchPhone (String surname){
        phoneNumberList.clear();
        for (Person p: personList
        ) {
            if (p.getSurname().equals(surname)){
                phoneNumberList.add(p.getPhoneNumber());
            }
        }
        return phoneNumberList;
    }

    public ArrayList<String> searchMail (String surname){
        mailList.clear();
        for (Person p: personList
        ) {
            if (p.getSurname().equals(surname)){
                mailList.add(p.getMail());
            }
        }
        return mailList;
    }


    public void add (Person newPerson){
        personList.add(newPerson);
    }
    public void addHash (Person newPerson){
       mapPhone.put (newPerson.getSurname()+newPerson.getName(),newPerson.getPhoneNumber());
       mapMail.put (newPerson.getSurname()+newPerson.getName(),newPerson.getMail());
    }
}
