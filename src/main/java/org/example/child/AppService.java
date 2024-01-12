package org.example.child;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    @Autowired
    private AppProperties appProperties;

    public String printAppProperties() {
        return appProperties.getName() + " " + appProperties.getDescription();
    }

}

