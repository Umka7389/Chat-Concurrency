package Java2.HW3;

public class Person {
    private String name;
    private String surname;
    private String phoneNumber;
    private String mail;

    Person(String name, String surname,String phoneNumber,String mail, PhoneBook phoneBook){
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        phoneBook.add(this);
        phoneBook.addHash(this);
    }



    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMail() {
        return mail;
    }
}
