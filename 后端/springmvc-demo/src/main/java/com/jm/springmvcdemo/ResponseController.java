package com.jm.springmvcdemo;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/response")
public class ResponseController {

    @ResponseBody
    @RequestMapping("/returnPage")
    public String returnPage() {
        //List<Integer> list = List.of(1, 2, 3);
        return "/index.html";
    }

    @ResponseBody
    @RequestMapping("returnHtml")
    public String returnHtml() {
        return "<h1>这是一级标签</h1>";
    }

    @ResponseBody
    @RequestMapping("returnJson")
    public Person returnJson() {
        return new Person("猫咪", 1, 18);
    }

    @ResponseBody
    @RequestMapping("/setStatus")
    public String setStatus(HttpServletResponse response) {
        response.setStatus(500);
        return "设置状态码成功!";
    }

}
