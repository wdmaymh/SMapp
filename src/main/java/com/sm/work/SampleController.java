package com.sm.work;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping("/sample")
    public String hello(Model model){
        model.addAttribute("name","test");
        return "hello";

    }
}
