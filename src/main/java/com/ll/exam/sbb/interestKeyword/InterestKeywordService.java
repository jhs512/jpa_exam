package com.ll.exam.sbb.interestKeyword;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class InterestKeywordService {
    private final InterestKeywordRepository interestKeywordRepository;


    public Set<InterestKeyword> findOrCreateKeywords(String... keywordContents) {
        Set<InterestKeyword> interestKeywords = new HashSet<>();

        for (String keywordContent : keywordContents) {
            interestKeywords.add(findOrCreateKeyword(keywordContent));
        }

        return interestKeywords;
    }

    public InterestKeyword findOrCreateKeyword(String keywordContent) {
        InterestKeyword interestKeyword = interestKeywordRepository.findByContent(keywordContent);

        if (interestKeyword == null) {
            interestKeyword = InterestKeyword.builder()
                    .content(keywordContent)
                    .build();
            interestKeywordRepository.save(interestKeyword);
        }

        return interestKeyword;
    }
}
