package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import com.example.demo.soap.GetSumRequest;
import com.example.demo.soap.GetSumResponse;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.soap.GetSumRequest;
import com.example.demo.soap.GetSumResponse;
import com.example.demo.CalculatorEndpoint;

@RestController
public class SOAcontroller {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @PostMapping("/sum")
    public int sum(@RequestParam(value = "A") int A, @RequestParam(value = "B") int B, @RequestParam(value = "C") int C) {
        GetSumRequest res = new GetSumRequest();
        res.setFirstNumber(A);
        res.setSecondNumber(B);
        res.set3rdNumber(C);

        CalculatorEndpoint c = new CalculatorEndpoint();

        return c.sum(res).getResult();
    }
}





