package com.JavaBot.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JavaBotController {

  // When JavaBot home page is requested it comes up
  // Think of requesting "Contact us" or "About"
   @RequestMapping("javabot")
  public String javabot() {
    System.out.println("Hello?");
    return "javabot.jsp";
  }
  
}
