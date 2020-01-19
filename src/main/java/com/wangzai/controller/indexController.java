package com.wangzai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Wangjiang
 * @create 2019-12-21 18:03
 */
@Controller
public class indexController {

  @GetMapping("/index")
  public String index(){
    return "index";
  }
}
