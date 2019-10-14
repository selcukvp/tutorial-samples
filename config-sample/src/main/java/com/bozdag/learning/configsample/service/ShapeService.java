package com.bozdag.learning.configsample.service;

public class ShapeService {

  /**
   * Calculates and returns the volume of a cylinder.
   *
   * @param pi constant
   * @param radius positive double - in centimeters
   * @param height positive double - in centimeters
   * @return volume of the cylinder (in centimeter cube)
   */
  public double getCylinderVolume(double pi, double radius, double height) {
    return pi * radius * radius * height;
  }
}
