package com.HelloWebPage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class HelloWorld {



    @GetMapping("/pages")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello from BridgeLabz");
        return "hello";  // Renders hello.html with a message
    }
}
