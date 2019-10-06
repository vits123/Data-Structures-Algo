package com.designpattern.demo.Builder;

import com.designpattern.demo.Builder.Phone.Builder;

public class BuilderExample {

  public static void main(String[] args) {
    Phone.Builder builder = new Builder()
        .backPanel("Sandstone")
        .frontPanel("AMOLED")
        .processor("Snapdragon")
        .camera("12 MP");

    Phone phone = builder.build();
    System.out.println(phone);


  }


}
