package com.wangzai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Wangjiang
 * @create 2019-12-21 17:11
 */

@Controller
public class toYouController {
  @GetMapping("/")
  public String toYou(){
    return "toyou";
  }
}
