/*
  Builder pattern
 1. Helps construct/create immutable objects
 2. Alternative approach to telescoping constructor pattern

 */

package com.designpattern.demo.Builder;

public class Phone {

  public static class Builder {

    private String frontPanel;
    private String backPanel;
    private String processor;
    private String camera;

    public Builder() {

    }

    public Phone build() {
      return new Phone(this);
    }


    public Builder frontPanel(String frontPanel) {
      this.frontPanel = frontPanel;
      return this;
    }

    public Builder backPanel(String backPanel) {
      this.backPanel = backPanel;
      return this;
    }


    public Builder processor(String processor) {
      this.processor = processor;
      return this;
    }

    public Builder camera(String camera) {
      this.camera = camera;
      return this;
    }

  }


  private String frontPanel;
  private String backPanel;
  private String processor;
  private String camera;

  private Phone(Builder builder) {
    this.frontPanel = builder.frontPanel;
    this.backPanel = builder.backPanel;
    this.processor = builder.processor;
    this.camera = builder.camera;
  }


  public String getFrontPanel() {
    return frontPanel;
  }

  public void setFrontPanel(String frontPanel) {
    this.frontPanel = frontPanel;
  }

  public String getBackPanel() {
    return backPanel;
  }

  public void setBackPanel(String backPanel) {
    this.backPanel = backPanel;
  }

  public String getProcessor() {
    return processor;
  }

  public void setProcessor(String processor) {
    this.processor = processor;
  }

  public String getCamera() {
    return camera;
  }

  public void setCamera(String camera) {
    this.camera = camera;
  }


  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Phone{");
    sb.append("frontPanel='").append(frontPanel).append('\'');
    sb.append(", backPanel='").append(backPanel).append('\'');
    sb.append(", processor='").append(processor).append('\'');
    sb.append(", camera='").append(camera).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
