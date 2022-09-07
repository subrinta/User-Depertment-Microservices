package com.learning.depertment.controller;

import com.learning.depertment.entity.Depertment;
import com.learning.depertment.service.DepertmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/depertments")
@Slf4j
public class DepertmentController {
    @Autowired
    private DepertmentService depertmentService;

    @PostMapping("")
    public Depertment saveDepertment(@RequestBody Depertment depertment){
        return  depertmentService.saveDepertment(depertment);
    }

    @GetMapping("/{id}")
    public Depertment findDepertmentById(@PathVariable("id") Long id){
        return depertmentService.findDepertmentById(id);
    }
}
