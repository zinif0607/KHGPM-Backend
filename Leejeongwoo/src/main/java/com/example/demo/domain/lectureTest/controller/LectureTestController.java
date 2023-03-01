package com.example.demo.domain.lectureTest.controller;

import com.example.demo.domain.lectureTest.entity.TestMember;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j // 로그
@RestController // json형태이며 url맵핑 해주는거
@RequestMapping("/spring-2nd")
public class LectureTestController {

    @GetMapping("/first")
    public String helloSpring () {
        log.info("helloSpring(): 이거 왜 안돼 ? ");

        return "Hello Spring";

    }
    @GetMapping("/second")
    public String helloSpring2(){
        return "Hello Test";
    }

    @GetMapping("/third")
    public TestMember returnEntityTest(){
        TestMember testMember =
                new TestMember( 1L, "Hi",  7L );

        return testMember;
    }
}