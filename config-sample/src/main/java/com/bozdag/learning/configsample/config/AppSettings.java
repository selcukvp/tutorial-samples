package com.bozdag.learning.configsample.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "cylinder")
public class AppSettings {

  private double pi;
  private double radius;
  private double height;

  public double getPi() {
    return pi;
  }

  public void setPi(double pi) {
    this.pi = pi;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }
}
