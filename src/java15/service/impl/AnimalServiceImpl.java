package java15.service.impl;

import java15.gender.Gender;
import java15.models.Animal;
import java15.service.GenericService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnimalServiceImpl implements GenericService <Animal>{
    private  List<Animal> animals = new ArrayList<>();
    @Override
    public String add(List<Animal> animal) {
        animals.addAll(animal);
        return "Animals successfully added! ";
    }

    @Override
    public Animal getById(Long id) {
        for (Animal animal : animals) {
            if(animal.getId().equals(id)){
                return animal;
            }

        }
        return null;
    }

    @Override
    public List<Animal> getAll() {
        return animals;
    }

    @Override
    public List<Animal> sortByName(int order) {
        if(order == 1){
            animals.sort(Comparator.comparing(Animal::getName));
        } else if (order == 2) {
            animals.sort(Comparator.comparing(Animal::getName).reversed());

        }
        return animals;
    }

    @Override
    public List<Animal> filterByGender(int gender) {
        Gender fltrGender = (gender == 1 ) ? Gender.FEMALE : Gender.MALE;
        List<Animal> filtered = new ArrayList<>();

        for (Animal animal : animals) {
            if(animal.getGender() == fltrGender){
                filtered.add(animal);
            }

        }
        return filtered;
    }

    @Override
    public List<Animal> clear() {
        animals.clear();
        return animals;
    }
}
