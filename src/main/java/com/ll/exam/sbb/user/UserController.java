package com.ll.exam.sbb.user;

import com.ll.exam.sbb.interestKeyword.InterestKeyword;
import com.ll.exam.sbb.interestKeyword.InterestKeywordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final InterestKeywordService interestKeywordService;

    @GetMapping("/t1")
    public String t1() {
        userService.t1();

        return "t1";
    }

    @GetMapping("/t2")
    public String t2() {
        userService.t2();

        return "t2";
    }

    @GetMapping("/t3")
    public String t3() {
        userService.t3();

        return "t3";
    }
}
