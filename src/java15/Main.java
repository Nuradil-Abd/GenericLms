package java15;

import java15.gender.Gender;
import java15.models.Animal;
import java15.models.Person;
import java15.service.impl.AnimalServiceImpl;
import java15.service.impl.PersonServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PersonServiceImpl personService = new PersonServiceImpl();
        AnimalServiceImpl animalService = new AnimalServiceImpl();

        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1L, "Asylbek", 24, Gender.MALE));
        persons.add(new Person(2L, "Alina", 28, Gender.FEMALE));
        persons.add(new Person(3L, "Bektur", 22, Gender.MALE));
        persons.add(new Person(4L, "Bermet", 18, Gender.FEMALE));
        persons.add(new Person(5L, "Ilim", 30, Gender.MALE));
        System.out.println(personService.add(persons));

        System.out.println("personService.getAll() = " + personService.getAll());
        System.out.println("~~~~~~~~~~~~~~~~~~~`");
        System.out.println("personService.sortByName(1) = " + personService.sortByName(1));
        System.out.println("~~~~~~~~~~~~~~~~~~~`");
        System.out.println("personService.sortByName(2) = " + personService.sortByName(2));
        System.out.println("~~~~~~~~~~~~~~~~~~~`");
        System.out.println("personService.filterByGender(1) = " + personService.filterByGender(1));
        System.out.println("~~~~~~~~~~~~~~~~~~~`");
        System.out.println("personService.filterByGender(2) = " + personService.filterByGender(1));
        System.out.println("~~~~~~~~~~~~~~~~~~~`");
        System.out.println("personService.clear() = " + personService.clear());


        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(1L, "Giraffe", 8, Gender.MALE));
        animals.add(new Animal(2L, "Dog", 4, Gender.FEMALE));
        animals.add(new Animal(3L, "Cat", 11, Gender.MALE));
        animals.add(new Animal(4L, "Elephant", 18, Gender.FEMALE));
        animals.add(new Animal(5L, "Cow", 7, Gender.MALE));
        System.out.println(animalService.add(animals));

        System.out.println("animalService.getAll() = " + animalService.getAll());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("animalService.sortByName(1) = " + animalService.sortByName(1));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("animalService.sortByName(2) = " + animalService.sortByName(1));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("animalService.filterByGender(1) = " + animalService.filterByGender(1));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("animalService.filterByGender(2) = " + animalService.filterByGender(1));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("animalService.clear() = " + animalService.clear());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}