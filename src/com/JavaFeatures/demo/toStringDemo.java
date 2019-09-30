package com.JavaFeatures.demo;

class Box {

  private double width;
  private double depth;
  private double height;

  public Box(double w, double d, double h) {
    this.width = w;
    this.depth = d;
    this.height = h;
  }

  public String toString() {
    return "Dimensions are " + width + " by " + depth + " by " + height + ".";
  }

}

public class toStringDemo {


  public static void main(String[] args) {
    Box b = new Box(20, 10, 5);  // Implicit call to toString()
    String s = "Box b: " + b;
    System.out.println(b);
    System.out.println(s);

  }

}
