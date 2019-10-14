package com.bozdag.learning.configsample.config;

import com.bozdag.learning.configsample.service.ShapeService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AppSettings.class)
public class AppConfiguration {

  @Bean
  public ShapeService shapeService() {
    return new ShapeService();
  }
}
