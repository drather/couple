package com.maker.couple.repository;

import com.maker.couple.domain.Matching;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchingRepository extends JpaRepository<Matching, Integer> {
}
