package com.jm.springmvcdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalcController {
    @RequestMapping("/sum")
    public String sum(@RequestParam Integer num1, @RequestParam Integer num2) {
        Integer sum = num1 + num2;
        return "计算的结果为: " + sum;
    }
}
