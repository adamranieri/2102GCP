package dev.ranieri.generics;

public interface CrudDAO<T> {

    T save(T t);

    T getById(int id);
}
