package com.popov.repo;


import com.popov.models.Field;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldRepository extends CrudRepository<Field, Integer> {
    Field findByName(String name);
}