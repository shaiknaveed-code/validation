package com.validation.service;

import com.validation.entity.Valid;
import com.validation.repo.ValidRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ValidService {

    @Autowired
    public ValidRepo validRepo;

    public List<Valid> getall(){
        return validRepo.findAll();
    }

    public List<Valid> saveall(List<Valid> valids){
        return validRepo.saveAll(valids);
    }

}
