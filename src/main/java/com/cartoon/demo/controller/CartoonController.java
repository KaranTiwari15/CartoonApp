package com.cartoon.demo.controller;
import java.util.*;

import com.cartoon.demo.model.Cartoon;
import com.cartoon.demo.service.CartoonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
public class CartoonController {

    @Autowired
    private CartoonService cartoonService;

    @GetMapping("/cartoons/home")
    public String home(){
        return "this is home page";
    }

    @PostMapping("/cartoons")
    public int addCartoon(@RequestBody Cartoon emp)
    {
        return cartoonService.addCartoon(emp);
    }

    @GetMapping("/cartoons")
    public List<Cartoon> getAllCartoon()
    {
        return cartoonService.getAllCartoon();
    }

    @GetMapping("/cartoons/{id}")
    public Cartoon getCartoon(@PathVariable("id") int id)
    {
        return cartoonService.getCartoon(id);
    }

    @DeleteMapping("/cartoons/{id}")
    public int deleteCartoon(@PathVariable("id") int id)
    {
        return  cartoonService.deleteCartoon(id);
    }
}
