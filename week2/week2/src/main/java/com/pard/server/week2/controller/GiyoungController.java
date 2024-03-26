package com.pard.server.week2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Giyoung")
public class GiyoungController {
    @GetMapping
    public String user(){
        return "이름 : 김기영, 나이 : 24, 학과 : 전산심화, 취미 : 디지털드로잉";
    }

    @RequestMapping("/others")
    @GetMapping
    public String requsetTest(
            @RequestParam(defaultValue = "guest") String name,
            @RequestParam(defaultValue = "0") Integer age,
            @RequestParam(defaultValue = "GLS") String major,
            @RequestParam(defaultValue = "sleeping") String hobby
    ) {
        return "이름 : " + name + ", 나이 : " + age + ", 학과 : " + major + ", 취미 : " + hobby;
    }
}
