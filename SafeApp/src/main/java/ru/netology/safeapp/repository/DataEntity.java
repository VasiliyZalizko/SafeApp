package ru.netology.safeapp.repository;

import javax.persistence.*;
import ru.netology.safeapp.model.Contact;
import ru.netology.safeapp.model.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DataEntity implements CommandLineRunner {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    @Transactional
    public void run(String... args) throws Exception {

        Person viktor = Person.builder().contact(Contact.builder()
                        .name("Viktor")
                        .surname("Chernenko")
                        .age(31)
                        .build())
                .phoneNumber("+7 (111) 111-11-11")
                .cityOfLiving("Moscow")
                .build();

        Person efim = Person.builder().contact(Contact.builder()
                        .name("Efim")
                        .surname("Malkov")
                        .age(32)
                        .build())
                .phoneNumber("+7 (222) 222-22-22")
                .cityOfLiving("St. Petersburg")
                .build();

        Person vladislav = Person.builder().contact(Contact.builder()
                        .name("Vladislav")
                        .surname("Reznikov")
                        .age(33)
                        .build())
                .phoneNumber("+7 (333) 333-33-33")
                .cityOfLiving("Krasnodar")
                .build();
    }
}