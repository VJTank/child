package org.example.child;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final MyAppProperties properties;

    public MyService(MyAppProperties properties) {
        this.properties = properties;
    }
}
