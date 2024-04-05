import models.Contact;
import models.Email;
import models.Phone;

import java.util.*;

public class Quiz {
    public static void main(String[] args){


        List<Contact> contactList =new ArrayList<>();

        contactList.add(new Contact("David",
                "Sanger",
                "Argos LLC",
                "Sales Manager",
                List.of(new Phone("240-133-0011","Home") , new Phone("240-112-0123","Mobile")),
                List.of(new Email("dave.sang@gmail.com","Home") ,new Email("dsanger@argos.com","Work") )));

        contactList.add(new Contact("Carlos",
                "Jimenez",
                "Zappos",
                "Director",
                List.of(),
                List.of()));

        contactList.add(new Contact("Ali",
                "Gafar",
                "BMI Services",
                "HR Manager",
                List.of(new Phone("412-116-9988 ","Work")),
                List.of(new Email("ali@bmi.com","Work") )));


        contactList.sort(Comparator.comparing(Contact::getLastName));

        System.out.println("Contact List in Json");
        System.out.println("-------------------------\n");
        System.out.println("Contacts\n{");
        for (Contact contact : contactList){
            System.out.println("\t"+contact.toString());
        }

        System.out.println("}");

    }
}
