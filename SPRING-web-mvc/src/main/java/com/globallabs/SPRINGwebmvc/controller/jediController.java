package com.globallabs.SPRINGwebmvc.controller;

import com.globallabs.SPRINGwebmvc.model.Jedi;
import com.globallabs.SPRINGwebmvc.repository.jediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class jediController {

    @Autowired
    private jediRepository repository;

    @GetMapping("/jedi")
    public ModelAndView jedi(){

        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("jedi");

        modelAndView.addObject("allJedi", repository.getAllJedi());

        return modelAndView;
    }

    @GetMapping("/new-jedi")
    public ModelAndView newJedi(){

        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("new-jedi");

        modelAndView.addObject("jedi", new Jedi());

        return modelAndView;
    }

    @PostMapping("jedi")
    public String createJedi(@Validated @ModelAttribute Jedi jedi, BindingResult result){

        if (result.hasErrors()){
            return "new-jedi";
        }

        repository.add(jedi);

        return "redirect:jedi";
    }

}
