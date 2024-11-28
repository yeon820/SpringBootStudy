package com.example.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // 기본 페이지 요청 메서드
    @GetMapping("/") // "/" 이 주소가 요청되면 아래의 메서드가 실행됨
    public String index() {
        return "index"; // => templates 폴더의 index.htmml을 찾아감
    }
}
