package org.example.child;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private MyAppProperties propertyUser;

    @GetMapping("/test")
    public String testProperties() {
        return propertyUser.getMessage() + ": "+ propertyUser.getNumber();
    }
}
