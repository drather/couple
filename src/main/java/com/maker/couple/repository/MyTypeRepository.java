package com.maker.couple.repository;

import com.maker.couple.domain.MyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyTypeRepository extends JpaRepository<MyType, Integer> {

}
