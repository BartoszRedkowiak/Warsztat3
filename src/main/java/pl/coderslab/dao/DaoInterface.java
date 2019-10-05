package pl.coderslab.dao;

import java.util.List;

public interface DaoInterface<T> {
    List<T> findall();
    T findbyID(Long id);
    T updateAll(T id);
    T update(T t);
    T create(T t);
    boolean remove (T t);
}
