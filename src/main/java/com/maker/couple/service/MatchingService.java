package com.maker.couple.service;

import com.maker.couple.domain.Matching;
import com.maker.couple.domain.MyType;
import com.maker.couple.repository.MatchingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class MatchingService {
    @Autowired
    MatchingRepository matchingRepository;

    public List<Matching> getList() {
        return matchingRepository.findAll();
    }

    public Matching findById(int id) {
        return matchingRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public Matching save(Matching matching) {
        return matchingRepository.save(matching);
    }

    public void delete(int id) {
        matchingRepository.deleteById(id);
    }
}
