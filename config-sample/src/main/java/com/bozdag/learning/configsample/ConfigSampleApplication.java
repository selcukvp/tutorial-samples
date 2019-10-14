package com.bozdag.learning.configsample;

import com.bozdag.learning.configsample.config.AppSettings;
import com.bozdag.learning.configsample.service.ShapeService;
import java.text.NumberFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConfigSampleApplication {

  private static final Logger LOGGER = LoggerFactory.getLogger(ConfigSampleApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(ConfigSampleApplication.class, args);
  }

  @Bean
  public CommandLineRunner demo(ShapeService shapeService, AppSettings appSettings) {

    return (args) -> {
      double cylinderVolume =
          shapeService.getCylinderVolume(
              appSettings.getPi(), appSettings.getRadius(), appSettings.getHeight());

      LOGGER.info(
          "Volume of the cylinder is {} cm^3",
          NumberFormat.getNumberInstance().format(cylinderVolume));
    };
  }
}
