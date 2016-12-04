package com.adaphi.falcon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Adaphi Techonology Inc.
 */
@RestController
public class DummyController {

  @RequestMapping("/")
  public String index() {
    return "Greetings from Spring Boot!";
  }

}
