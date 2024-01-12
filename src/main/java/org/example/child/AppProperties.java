package org.example.child;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("myapp")
@Getter
@Setter
@Component
public class AppProperties {

    @Value("${myapp.app.name}")
    private String name;

    @Value("${myapp.app.description}")
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}

