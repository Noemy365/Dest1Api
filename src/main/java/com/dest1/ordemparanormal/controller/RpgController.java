package com.dest1.ordemparanormal.controller;

import com.dest1.ordemparanormal.entity.Rpg;
import com.dest1.ordemparanormal.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/rpg")
    public class RpgController {

    @Autowired
    private repository repository;

    @GetMapping
    public List<Rpg> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Rpg cadastrar(@RequestBody Rpg rpg) {
        return repository.save(rpg);
    }
}
