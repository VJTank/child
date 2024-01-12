package org.example.child;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "my-app")
@Getter
@Setter
@Configuration
public class MyAppProperties {
    private String message;
    private int number;
}
