package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {
    @Autowired
    StringService stringService;

    @RequestMapping("/revert/{str}")
    public String RevertString(@PathVariable("str") String str){
        return stringService.RevertString(str);
    }

    @RequestMapping("/CountWords/{str}")
    public int CountWords(@PathVariable("str") String str) {
        return stringService.CountWords(str);
    }

    @RequestMapping("/Caps/{str}")
    public String CapsString(@PathVariable("str") String str){
        return stringService.CapsString(str);
    }
}
