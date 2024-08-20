package com.example.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class MciController {
    @GetMapping("phone/{phone}")
    public String getPhone(HttpServletRequest request, @PathVariable String phone) {
        System.out.println((request.getSession()));
        System.out.println(request.getParameter("name"));
        return phone;
    }

}
