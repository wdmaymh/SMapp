package com.sm.work.sutffSize;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StuffSizeController {

    @GetMapping("/api/stuffSize/")
    public String hello(){
        return "hello";
    }
}
