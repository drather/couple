package com.maker.couple.service;

import com.maker.couple.domain.MyType;
import com.maker.couple.repository.MyTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class MyTypeService {
    @Autowired
    MyTypeRepository myTypeRepository;

    public List<MyType>  getList() {
        return myTypeRepository.findAll();
    }

    public MyType findById(int id) {
        return myTypeRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public MyType save(MyType myType) {
        return myTypeRepository.save(myType);
    }

    public void delete(int id) {
        myTypeRepository.deleteById(id);
    }
}
