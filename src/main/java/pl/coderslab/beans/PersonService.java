package pl.coderslab.beans;

import org.springframework.stereotype.Component;

@Component
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public PersonRepository getPersonRepo() {
        return personRepository;
    }
}
