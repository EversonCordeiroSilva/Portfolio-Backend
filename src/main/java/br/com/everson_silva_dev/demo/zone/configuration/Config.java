package br.com.everson_silva_dev.demo.zone.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public String helloworldObject(){
        StringBuilder stringBuilder = new StringBuilder("{\n");
        stringBuilder.append("\t\"message\"");
        stringBuilder.append(":");
        stringBuilder.append("\"myHelloworld\"");
        stringBuilder.append("\n}");
        return stringBuilder.toString();
    }
}
