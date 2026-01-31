package com.tp.mvc;

import com.tp.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
    private final MessageService service;
    @Autowired
    public FormController(MessageService service) {
        this.service = service;
    }
    @PostMapping("/send")
    public String send(@RequestParam String content, Model model) {
        model.addAttribute("msg", service.process(content));
        return "result";
    }
}