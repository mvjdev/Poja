package com.ricka.princy.endpoint.rest;

import com.ricka.princy.repository.model.Person;
import com.ricka.princy.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    @GetMapping("/poja-soratra")
    void getAll(@RequestBody File file){
        personService.uploadFile(file);
    }
}
















