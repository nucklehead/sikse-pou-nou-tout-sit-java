package com.aigleinfo.siksepounoutout.rest.controllers;

import com.aigleinfo.siksepounoutout.model.Account;
import com.aigleinfo.siksepounoutout.repository.AccountRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/web/")
@Api
public class AppController {

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String index(Model model) {
        model.addAttribute("name", "JP");
        return "home";
    }
}
