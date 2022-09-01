package com.ll.exam.sbb.interestKeyword;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InterestKeywordRepository extends JpaRepository<InterestKeyword, Long>, InterestKeywordCustomRepository {
    InterestKeyword findByContent(String content);
}
