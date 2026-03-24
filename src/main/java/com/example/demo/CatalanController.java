package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CatalanController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private CatalanService catalanService;

    public CatalanController(CatalanService catalanService){
        this.catalanService = catalanService;
    }

    @GetMapping("/catalan")
    public CatalanResponse catalan(@RequestParam(value = "num") int num) {
        return catalanService.catalan(num);
    }
}
