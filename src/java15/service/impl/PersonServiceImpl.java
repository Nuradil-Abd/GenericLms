package java15.service.impl;

import java15.gender.Gender;
import java15.models.Person;
import java15.service.GenericService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonServiceImpl implements GenericService<Person> {
    private List<Person> persons = new ArrayList<>();

    @Override
    public String add(List <Person> person) {
        persons.addAll(person);
        return "Person successfully added!";
    }

    @Override
    public Person getById(Long id) {
        for (Person person : persons) {
            if(person.getId().equals(id)){
                return person;
            }

        }
        return null;
    }

    @Override
    public List<Person> getAll() {
        return persons;
    }

    @Override
    public List<Person> sortByName(int order) {

        if(order == 1){
            persons.sort(Comparator.comparing(Person::getName));
        } else if (order == 2) {
            persons.sort(Comparator.comparing(Person::getName).reversed());

        }
        return persons;
    }

    @Override
    public List<Person> filterByGender(int gender) {

        Gender fltrGender = (gender == 1) ? Gender.FEMALE : Gender.MALE;
        List<Person> filtered = new ArrayList<>();

        for (Person person : persons) {
            if(person.getGender() == fltrGender){
                filtered.add(person);
            }

        }
        return filtered;
    }

    @Override
    public List<Person> clear() {
        persons.clear();
        return persons;
    }
}
