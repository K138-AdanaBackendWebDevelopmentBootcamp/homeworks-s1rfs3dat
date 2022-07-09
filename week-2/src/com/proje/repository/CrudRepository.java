package com.proje.repository;
import java.util.List;
public interface CrudRepository<Type> {
    List<Type> findAll();
    Type findById(int id);
    void saveToDatabase(Type object);
    void deleteFromDatabase(Type object);
    void deleteFromDatabase(int id);
    void updateOnDatabase(Type object, int id);


}
