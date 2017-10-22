package com.aigleinfo.siksepounoutout.web;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Api
public class AppController {

  @RequestMapping(method = RequestMethod.GET, path = "/")
  public String index(Model model) {
    model.addAttribute("name", "JP");
    model.addAttribute("title", "Home Page");

    return "home";
  }
}
