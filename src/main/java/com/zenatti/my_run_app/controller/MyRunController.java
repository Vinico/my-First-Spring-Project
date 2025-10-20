package com.zenatti.my_run_app.controller;

import com.zenatti.my_run_app.entity.Atividade;
import com.zenatti.my_run_app.service.MyRunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/my-run")
public class MyRunController {

    @Autowired
    private MyRunService myRunService;




    @GetMapping("/get/{id}")
    Atividade get(@PathVariable("id") Long id){

        return myRunService.get(id);
    }



    @PostMapping
    void create(@RequestBody Atividade atividade){
        myRunService.create(atividade);
    }

    @PutMapping
    void update(Atividade atividade){
        myRunService.update(atividade);
    }

    @GetMapping("/getlist")
    List<Atividade> list(){
        return myRunService.list();
    }

    @DeleteMapping("{id}")
    void delete(@PathVariable("id") Long id){
        myRunService.delete(id);
    }


}
