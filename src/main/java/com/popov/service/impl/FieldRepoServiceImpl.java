package com.popov.service.impl;


import com.popov.models.Field;
import com.popov.repo.FieldRepository;
import com.popov.service.FieldRepositoryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FieldRepoServiceImpl implements FieldRepositoryService {

    private final FieldRepository fieldRepository;

    public FieldRepoServiceImpl(FieldRepository fieldRepository) {
        this.fieldRepository = fieldRepository;
    }

    @Override
    public Field getFieldByName(String fieldName) {
        return fieldRepository.findByName(fieldName);
    }
    @Override
    public synchronized void save(Field field) {
        fieldRepository.save(field);
    }

    @Override
    public List<Field> getAllField() {
        List<Field> list = new ArrayList<>();
        Iterable<Field> iterable = fieldRepository.findAll();
        iterable.forEach(list::add);
        return list;
    }
}
