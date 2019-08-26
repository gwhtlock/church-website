package org.launchcode.churchwebsite.controllers;


import org.launchcode.churchwebsite.models.User;
import org.launchcode.churchwebsite.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("MCMBC")
public class ChurchController {

    @Autowired
    private UserDao userDao;


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

    @RequestMapping("Users")
    public String userList(Model model){

        model.addAttribute("users", userDao.findAll());

        return "church/user-list";
    }

    @RequestMapping(value = "AddUser", method = RequestMethod.GET)
    public String displayAddUserForm(Model model) {
        model.addAttribute("title", "Add User");
        model.addAttribute(new User());
        return "church/add";
    }

    @RequestMapping(value = "AddUser", method = RequestMethod.POST)
    public String processAddCheeseForm(@ModelAttribute  User newUser,
                                       Errors errors, Model model) {


//
//        if (errors.hasErrors()) {
//            model.addAttribute("title", "Add Cheese");
//            return "cheese/add";
//        }

        userDao.save(newUser);
        return "redirect:";
    }


}
