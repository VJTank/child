package org.example.child;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

  @Autowired
  private AppService appService;

  @GetMapping("/name")
  public String getName() {
    return appService.printAppProperties();
  }

}

