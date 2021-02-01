package lk.kathapotha.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/books")
public class BookController {

    @RequestMapping(value = "/save",method = RequestMethod.GET)
    public String hello(){
        return  "Hello All";
    }

}
