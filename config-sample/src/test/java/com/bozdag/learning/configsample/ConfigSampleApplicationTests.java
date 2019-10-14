package com.bozdag.learning.configsample;

import static org.junit.Assert.assertEquals;

import com.bozdag.learning.configsample.config.AppConfiguration;
import com.bozdag.learning.configsample.config.AppSettings;
import com.bozdag.learning.configsample.service.ShapeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppConfiguration.class)
public class ConfigSampleApplicationTests {

  @Autowired private ShapeService shapeService;
  @Autowired private AppSettings appSettings;

  @Test
  public void givenTestConfigurationWhenGetCylinderVolumeReturnVolume() {
    double expectedVolume = 150.0;

    double cylinderVolume =
        shapeService.getCylinderVolume(
            appSettings.getPi(), appSettings.getRadius(), appSettings.getHeight());

    assertEquals(expectedVolume, cylinderVolume, 0.0);
  }
}
