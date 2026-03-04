package com.validation.controller;


import com.validation.entity.Valid;
import com.validation.service.ValidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ValidController {

    @Autowired
    public ValidService validService;

    @GetMapping
    public List<Valid> getall(){
        return validService.getall();
    }

    @PostMapping
    public List<Valid> saveall(@RequestBody List<Valid> valids){
        return validService.saveall(valids);
    }

}
