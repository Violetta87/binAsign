package com.example.binasign;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {

    @GetMapping("/hej")
    public String meth(){
        return"Bin";

    }
}
