package me.yeonnex.auth_service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempControllerTest {
    @GetMapping("/testhome")
    public String home(){
        System.out.println("HOME TEST!!!");
        return "test";
    }
}
