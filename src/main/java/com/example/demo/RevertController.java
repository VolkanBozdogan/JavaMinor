package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RevertController {
    @Autowired
    RevertService revertService;

    @RequestMapping("/revert/{str}")
    public String RevertString(@PathVariable("str") String str){
        return revertService.RevertString(str);
    }
}
