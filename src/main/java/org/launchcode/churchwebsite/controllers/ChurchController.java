package org.launchcode.churchwebsite.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("MCMBC")
public class ChurchController {


    @RequestMapping("")
    public String index(Model model){


        return "church/index";
    }

    @RequestMapping("Events")
    public String events(Model model){


        return "church/events";
    }

    @RequestMapping("About")
    public String about(Model model){


        return "church/about";
    }


}
