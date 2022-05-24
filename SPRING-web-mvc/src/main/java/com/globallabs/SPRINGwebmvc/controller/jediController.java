package com.globallabs.SPRINGwebmvc.controller;

import com.globallabs.SPRINGwebmvc.model.Jedi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class jediController {

    @GetMapping("/jedi")
    public ModelAndView jedi(){

        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("jedi");

        final Jedi luke = new Jedi("Jose", "Tabosa");
        modelAndView.addObject("allJedi", List.of(luke));

        return modelAndView;
    }

}
