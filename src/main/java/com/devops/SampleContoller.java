package com.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleContoller {
  @GetMapping("/getNames")
  public String getName() {
	  return "AjaiRuban";
  }
}
