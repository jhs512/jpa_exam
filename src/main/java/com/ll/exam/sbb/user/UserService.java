package com.ll.exam.sbb.user;

import com.ll.exam.sbb.interestKeyword.InterestKeyword;
import com.ll.exam.sbb.interestKeyword.InterestKeywordService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final InterestKeywordService interestKeywordService;

    public void t1() {
        SiteUser u = SiteUser.builder()
                .username("user1")
                .build();
        userRepository.save(u);
    }

    @Transactional
    public void t2() {
        Set<InterestKeyword> interestKeywords = interestKeywordService.findOrCreateKeywords("피구", "피구", "농구");

        SiteUser u1 = SiteUser.builder()
                .username("user1")
                .build();

        u1.setInterestKeywords(interestKeywords);

        userRepository.save(u1);

        SiteUser u2 = SiteUser.builder()
                .username("user2")
                .build();

        u2.setInterestKeywords(interestKeywords);

        userRepository.save(u2);
    }

    @Transactional
    public void t3() {
        InterestKeyword interestKeyword_농구 = interestKeywordService.findOrCreateKeyword("농구");

        SiteUser u = userRepository.findById(1L).get();

        u.getInterestKeywords().remove(interestKeyword_농구);
    }
}