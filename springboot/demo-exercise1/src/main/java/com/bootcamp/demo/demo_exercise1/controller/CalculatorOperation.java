package com.bootcamp.demo.demo_exercise1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.bootcamp.demo.demo_exercise1.dto.mapper.InputMapper;

public interface CalculatorOperation {
    @GetMapping(value = "/operation")
    Object calculator(@RequestParam String valueA,
            @RequestParam String valueB,
            @RequestParam String operation)
            throws NumberFormatException;

    @GetMapping(value = "/operation/{x}/{y}/{z}")
    Object calculator2(@PathVariable(value = "x") String valueA,
            @PathVariable(value = "y") String valueB,
            @PathVariable(value = "z") String operation)
            throws NumberFormatException;

    @PostMapping(value = "/operation/")
    Object input(@RequestBody InputMapper input);

}
 