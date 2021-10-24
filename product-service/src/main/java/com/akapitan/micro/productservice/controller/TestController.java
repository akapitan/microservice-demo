package com.akapitan.micro.productservice.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
@RefreshScope
public class TestController {

  private final Environment environment;

  public TestController(Environment environment) {
    this.environment = environment;
  }

  @ResponseBody
  @GetMapping("/testvalue")
  public String getTestValue(){
    return environment.getProperty("test.message");
  }
}
