package java15.service;

import java.util.List;

public interface GenericService <T> {
    String add (List<T>t);
    T getById(Long id);
    List<T> getAll();
    List<T> sortByName(int order);
    List<T> filterByGender(int gender);
    List<T> clear();


}
